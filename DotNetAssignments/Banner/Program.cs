// Program.cs
using System;

public class Program
{
    public static void Main(string[] args)
    {
  
        Banner b = new Banner();
        Console.WriteLine("Price of standard banner: {0:F2}", b.Price());

     
        Console.Write("Banner Dimensions: ");
        float w = float.Parse(Console.ReadLine());
        float h = float.Parse(Console.ReadLine());

    
        Banner c = new Banner();
        c.Resize(w, h);
        Console.WriteLine("Price of custom banner: {0:F2}", c.Price());
    }
}
