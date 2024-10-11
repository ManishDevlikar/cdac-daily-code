namespace DemoApp.Utilities;

#nullable disable

public class SimpleStack<E> : IStackReader<E>
{
    //a nested class
    class Node
    {
        internal E entry;
        internal Node below;

        internal Node Skip(int count)
        {
            Node n = this;
            for(int i = 0; i < count; ++i)
                n = n.below;
            return n;
        }
    }

    private Node top;

    public void Push(E item)
    {
        top = new Node { entry = item, below = top };
    }

    public E Pop()
    {
        Node n = top;
        top = top.below;
        return n.entry;
    }

    public bool Empty()
    {
        return top is null;
    }

    //an indexer is a parameterized property which provides access
    //to a value kept within 'this' instance identified by the parameters
    //through an array-like syntax
    public E this[int index]
    {
        get { return top.Skip(index).entry; }
        set { top.Skip(index).entry = value; }
    }

    public struct Iterator(SimpleStack<E> target)
    {
        private Node next = target.top;

        public E Current { get; private set; }

        public bool MoveNext()
        {
            if(next != null)
            {
                Current = next.entry;
                next = next.below;
                return true;
            }
            return false;
        }
    }

    //A class supports standard iteration by defining a public
    //GetEnumerator() method whose return type includes public
    //definitions for Current property and MoveNext() method.
    public Iterator GetEnumerator()
    {
        return new Iterator(this);
    }

}