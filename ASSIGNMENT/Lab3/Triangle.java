
public class Triangle
{
    int hypotenus;
    int shortestSide;
    int a;
    int b;
    int c;
    
    public Triangle(int s1, int s2, int s3)
    {
      a = s1;
      b = s2;
      c = s3;
      
       if (a > b && a > c)
        {
            hypotenus = a;
            if (b > c)
            shortestSide = c;
            else if (c > b)
            shortestSide = b;
        }
        
        else if (b > a && b > c)
        {
            hypotenus = b;
            if (a > c)
            shortestSide = c;
            else if (c > a)
            shortestSide = a;
        }
        else if (c > a && c > b)
        {
            hypotenus = c;
            if (a > b)
            shortestSide = b;
            else if (b > a)
            shortestSide = a;
        }
    }
    
    
    public double getPerimeter()
    {
        double perimeter = a + b + c;
        return perimeter;
    }
    
    public double getArea()
    {
        //using Heron's Formula
        double s = (a + b + c)/2;
        double area = Math.sqrt(s *((s-a) * (s-b) * (s-c)));
        return area;
    }
    
    public double getRatio()
    {
        return hypotenus/shortestSide;
    }
}
