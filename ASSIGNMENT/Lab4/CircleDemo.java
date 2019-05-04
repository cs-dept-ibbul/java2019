import java.util.Scanner;
public class CircleDemo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("The number of Circles is: " + Circle.getNumberOfCircles());
        
        System.out.println("Please enter the radius of the Circle 1: ");
        Circle circle1 = new Circle(input.nextDouble());
        System.out.println("The number of circles is: " + circle1.getNumberOfCircles());
        
        System.out.println("Please enter the radius of the Circle 2: ");
        Circle circle2 = new Circle(input.nextDouble());
        System.out.println("The number of circles is: " + circle2.getNumberOfCircles());
        
        System.out.println("The Area of the first circle is: " + circle1.area());
        System.out.println("The Perimeter of the first circle is: " + circle1.circumference() + " cm");
        
        System.out.println("The Area of the second circle is: " + circle2.area());
        System.out.println("The Perimeter of the second circle is: " + circle2.circumference() + " cm");
    }
}
