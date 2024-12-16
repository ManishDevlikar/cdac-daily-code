namespace DemoApp.Utilities;

public class SimpleStack<E> : IStackReader<E>
{
    //a nested class
    class Node
    {
        internal E entry;
        internal Node below;
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

}