import java.util.Scanner;
public class BoxDemo
{
    
    public static void main(String[] args)
    {
        Box box = new Box();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Length");
        box.length = input.nextDouble();
        
        System.out.println("Enter the Width");
        box.width = input.nextDouble();
        
        System.out.println("Enter the Length");
        box.height = input.nextDouble();
        
        System.out.println("The volume is: " + box.getVolume());
        System.out.println("The volume is: " + box.getSurfaceArea());
    }
}
