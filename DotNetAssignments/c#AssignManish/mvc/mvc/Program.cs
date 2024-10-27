using mvc.model;
using Microsoft.AspNetCore.Builder;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;


var builder = WebApplication.CreateBuilder(args);
builder.Services.AddControllersWithViews();

builder.Services.AddScoped<EmpModel>();
var app = builder.Build();
app.MapDefaultControllerRoute();
// app.MapGet("/", () => "Hello World!");

app.Run();
