using razor.model;
using Microsoft.EntityFrameworkCore;

var builder = WebApplication.CreateBuilder(args);
builder.Services.AddScoped<EmpModel>(); // Add this line

// Register Razor Pages
builder.Services.AddRazorPages();

var app = builder.Build();

// Map Razor Pages
app.MapRazorPages();

// app.MapGet("/", context => context.Response.Redirect("/EmployeeList"));


app.MapGet("/", async context => 
{
    context.Response.Redirect("/EmployeeList");
    await Task.CompletedTask; // Ensure that the lambda returns a Task
});
app.Run();