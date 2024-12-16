
using System.Net;
using System.Net.Sockets;
using DemoApp.Models;

namespace DemoApp;

public class ShopWorker(IConfiguration config, ILogger<ShopWorker> logger, ShopModel model) : BackgroundService
{
    protected override async Task ExecuteAsync(CancellationToken stoppingToken)
    {
        int port = config.GetValue<int>("Listener:Port", 4002);
        logger.LogInformation("Starting shop server on TCP port {p}", port);
        //Step 1
        var listener = new TcpListener(IPAddress.Any, port);
        listener.Start();
        while(!stoppingToken.IsCancellationRequested)
        {
            //Step 2
            var client = await listener.AcceptTcpClientAsync(stoppingToken);
            //Step 3 and 4
            CommunicateAsync(client);
        }
    }

    private async void CommunicateAsync(TcpClient connection)
    {
        try
        {
            var remote = connection.GetStream();
            using var reader = new StreamReader(remote);
            using var writer = new StreamWriter(remote) { AutoFlush = true };
            await writer.WriteLineAsync("Welcome to EviTek computers");
            string name = await reader.ReadLineAsync();
            ItemInfo info = model.GetItemInfo(name);
            if(info != null)
                await writer.WriteLineAsync(info.ToString());
        }
        catch(Exception ex)
        {
            logger.LogError(ex, "Communication failure");
        }
        connection.Close();
    }
}