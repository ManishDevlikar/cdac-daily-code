using DemoApp.Utilities;

SimpleStack<string> a = new SimpleStack<string>();
a.Push("Monday");
a.Push("Tuesday");
a.Push("Wednesday");
a.Push("Thursday");
a.Push("Friday");
PrintStack(a);
Console.WriteLine("----");
SimpleStack<Interval> b = new SimpleStack<Interval>();
b.Push(new Interval(4, 31));
b.Push(new Interval(7, 42));
b.Push(new Interval(5, 13));
b.Push(new Interval(6, 24));
PrintStack(b);

static void PrintStack(IStackReader<object> source)
{
    while(!source.Empty())
        Console.Write("{0} ", source.Pop());
    Console.WriteLine();
}