using System;

public struct Banner
{
    private float width;
    private float height;

    public Banner()
    {
        width = 20.0f; 
        height = 5.0f;
    }

    public void Resize(float w, float h)
    {
        width = w;
        height = h;
    }

    public double Price()
    {
        float rate = width * height >= 100 ? 0.80f : 0.95f; 
        return width * height * rate;
    }
}
