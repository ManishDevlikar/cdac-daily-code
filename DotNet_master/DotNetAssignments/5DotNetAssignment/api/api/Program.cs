
using api.model;
using Microsoft.AspNetCore.Builder;
using Microsoft.Extensions.DependencyInjection;

var builder = WebApplication.CreateBuilder(args);
// Add CORS services with a specific policy
builder.Services.AddCors(options =>
{
    options.AddPolicy("AllowReactApp",
        builder =>
        {
            builder.WithOrigins("http://localhost:5173") // The URL of your React Vite app
                   .AllowAnyMethod()
                   .AllowAnyHeader();
        });
});

builder.Services.AddControllers();
// part of dependency injection configuration
builder.Services.AddScoped<EmpModel>();
var app = builder.Build();
app.UseDefaultFiles();
app.UseStaticFiles();
app.UseRouting();
app.UseCors("AllowReactApp");
app.MapControllers(); // enable attribute based route-mapping
app.Run();
