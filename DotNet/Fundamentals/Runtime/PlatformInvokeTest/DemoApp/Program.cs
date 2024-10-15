using DemoApp;

ulong l = ulong.Parse(args[0]);
ulong u = ulong.Parse(args[1]);
Console.WriteLine("Number of Primes = {0}", Primes.CountBetween(l, u)); 