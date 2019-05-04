import java.util.Scanner;
public class RectangleDemo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Length: ");
        double l = input.nextDouble();
        System.out.println("Please Enter the Width: ");
        double w = input.nextDouble();
        Rectangle rectangle = new Rectangle(l,w);
        System.out.println("The Area is : " + rectangle.area() + " square cm");
        System.out.println("The Length of the Rectangle is : " + rectangle.getLength() + " cm");
        System.out.println("Please enter the new Length of the Rectangle");
        
        rectangle.setLength(input.nextDouble());
        System.out.println("The new Length of the Rectangle is : " + rectangle.getLength() + " cm");
        System.out.println("The new Area of the Rectangle is: " + rectangle.area());
        
    }
}
