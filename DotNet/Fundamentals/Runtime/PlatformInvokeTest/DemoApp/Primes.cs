using System.Runtime.InteropServices;

namespace DemoApp;

class Primes
{
    [DllImport("primes", EntryPoint = "primes_count")]
    public extern static int CountBetween(ulong first, ulong second);
}