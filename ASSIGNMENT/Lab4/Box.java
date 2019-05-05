
public class Box
{
    private double length, width, height;
    
    public Box(double boxLength, double boxWidth, double boxHeight)
    {
        length = boxLength;
        width = boxWidth;
        height = boxHeight;
    }
    
    public double volume()
    {
        return length * width * height;
    }
    
    public double surfaceArea()
    {
        return 2 * (length*width + length*height + width*height);
    }
}
