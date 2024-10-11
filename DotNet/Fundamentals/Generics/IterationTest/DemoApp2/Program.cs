if (args.Length == 0)
{
    //ICollection<Interval> store = new List<Interval>();
    //ICollection<Interval> store = new HashSet<Interval>();
    ICollection<Interval> store = new SortedSet<Interval>();
    store.Add(new Interval(4, 31));
    store.Add(new Interval(2, 151));
    store.Add(new Interval(7, 22));
    store.Add(new Interval(6, 13));
    store.Add(new Interval(3, 44));
    store.Add(new Interval(5, 55));
    foreach(var i in store)
        Console.WriteLine(i);
}
else
{
    //IDictionary<string, Interval> store = new Dictionary<string, Interval>();
    //IDictionary<string, Interval> store = new SortedList<string, Interval>();
    IDictionary<string, Interval> store = new SortedDictionary<string, Interval>();
    store.Add("Monday", new Interval(4, 31));
    store.Add("Tuesday", new Interval(7, 22));
    store.Add("Wednesday", new Interval(6, 13));
    store.Add("Thursday", new Interval(3, 44));
    store["Friday"] = new Interval(5, 55);
    store["Monday"] = new Interval(8, 31);
    if(store.TryGetValue(args[0], out Interval val))
        Console.WriteLine("Interval = {0}", val);
    else
    {
        foreach(var pair in store)
            Console.WriteLine("{0, -12}{1, 8}", pair.Key, pair.Value);
    }
}