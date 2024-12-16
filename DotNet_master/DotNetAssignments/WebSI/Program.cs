// using DemoApp.Endpoints;
using DemoApp.Services;

var builder = WebApplication.CreateBuilder(args);
builder.Services.AddSingleton<IInterest, Simple>();
var app = builder.Build();


app.MapGet("/Si", Greeting.Welcome);
app.MapPost("/Simple", Greeting.Hello);    
// app.MapGet("/Ci", Greeting.CompoundForm);
// app.MapPost("/Compound", Greeting.Compound);

app.Run();
