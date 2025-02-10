using Microsoft.AspNetCore.Mvc;
using System.Net.Http;
using System.Threading.Tasks;

[ApiController]
[Route("api/[controller]")]
public class OrderController : ControllerBase
{
    private readonly HttpClient _httpClient;

    public OrderController(HttpClient httpClient)
    {
        _httpClient = httpClient;
    }

    [HttpPost]
    public async Task<IActionResult> CreateOrder([FromBody] Order order)
    {
        // Call User Service to validate user
        var userResponse = await _httpClient.GetAsync($"http://localhost:3000/users/{order.UserId}");
        if (!userResponse.IsSuccessStatusCode)
            return NotFound("User not found");

        // Call Product Service to validate product
        var productResponse = await _httpClient.GetAsync($"http://localhost:5001/products/{order.ProductId}");
        if (!productResponse.IsSuccessStatusCode)
            return NotFound("Product not found");

        // Save the order (for simplicity, we're just returning the order)
        return Ok(new { Message = "Order created successfully", Order = order });
    }
}

public class Order
{
    public int UserId { get; set; }
    public long ProductId { get; set; }
    public int Quantity { get; set; }
}