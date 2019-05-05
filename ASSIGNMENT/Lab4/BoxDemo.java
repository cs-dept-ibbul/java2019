import java.util.Scanner;
public class BoxDemo
{
  public static void main(String[] args)
  {
      
      Box box1 = new Box(20.0, 10.0, 15.0);
      Box box2 = new Box(6.0, 4.0, 2.0);
      
      
      System.out.println("The volume of box1 is: " + box1.volume() + " cubic cm");
      System.out.println("The surface area of box1 is: " + box1.surfaceArea() + " square cm");
      
      System.out.println("The volume of box2 is: " + box2.volume() + " cubic cm");
      System.out.println("The surface area of box2 is: " + box2.surfaceArea() + " square cm");
  }
}
