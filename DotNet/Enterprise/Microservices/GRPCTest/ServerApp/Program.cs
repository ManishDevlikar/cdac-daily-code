using ServerApp.Services;

var builder = WebApplication.CreateBuilder(args);
builder.Services.AddGrpc(); //enable gRPC
var app = builder.Build();
app.MapGrpcService<OrderManagerService>();
//gRPC requires HTTP/2 endpoint so configure Kestrel
//to enable HTTP/2 protocol (see appsettings.json)
app.Run();
