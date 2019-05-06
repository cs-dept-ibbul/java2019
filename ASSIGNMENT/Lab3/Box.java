
public class Box
{
    double length;
    double width;
    double height;
    double volume;
    double surfaceArea;
        
    public double getVolume()
    {
      volume = length * width * height;
      return volume;  
    }
    
     public double getSurfaceArea()
    {
      surfaceArea = length + width + height;
      return volume;  
    }
}
