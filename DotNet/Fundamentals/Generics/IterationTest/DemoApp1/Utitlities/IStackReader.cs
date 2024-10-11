namespace DemoApp.Utilities;

public interface IStackReader<out T>
{
    T Pop();
    bool Empty();
}