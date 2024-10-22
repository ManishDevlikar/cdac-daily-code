using DemoApp.Endpoints;

var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();
app.MapGet("/Si", Greeting.Welcome);
app.MapPost("/Simple", Greeting.Hello);    
app.MapGet("/Ci", Greeting.CompoundForm);
app.MapPost("/Compound", Greeting.Compound);

app.Run();
