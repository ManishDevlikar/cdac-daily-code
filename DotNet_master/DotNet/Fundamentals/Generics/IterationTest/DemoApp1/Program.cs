using DemoApp.Utilities;

SimpleStack<string> a = new SimpleStack<string>();
a.Push("Monday");
a.Push("tuesday");
a.Push("Wednesday");
a.Push("Thursday");
a.Push("Friday");
a[2] = "Holiday"; //using indexer
for(var e = a.GetEnumerator(); e.MoveNext();)
    Console.WriteLine(e.Current);
Console.WriteLine("------");
SimpleStack<double> b = new SimpleStack<double>();
b.Push(47.1);
b.Push(63.2);
b.Push(81.3);
b.Push(72.4);
b.Push(53.5);
b.Push(39.6);
//foreach loop can be applied to an array or an object
//whose class supports standard iterator pattern
foreach(double v in b)
    Console.WriteLine(v);
Console.WriteLine("------");
foreach(Interval i in RandomIntervals(4))
    Console.WriteLine(i);

//BCL provides support for standard iteration pattern using
//IEnumerable<E> interface that declares GetEnumerator()
//method with return type as IEnumerator<E> wich includes 
//definitions for Current property and MoveNext() method
static IEnumerable<Interval> RandomIntervals(int count)
{
    for(int i = 0; i < count; ++i)
    {
        int t = Random.Shared.Next(100, 500);
        //yield return statement sequentially (one-by-one) returns 
        //multiple results through an auto-generated implementation
        //of interface specified in return type
        yield return new Interval(0, t);
    }
}