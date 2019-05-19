
/**
 * Write a description of class closedBox here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ClosedBox
{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        double length, width, height,volume,area;
        System.out.println("Enter the length: ");
        length=input.nextDouble();
        System.out.println("Enter the width: ");
        width=input.nextDouble();
        System.out.println("Enter the height: ");
        height=input.nextDouble();
        //Calculating the volume of the box
        volume=height * width * length;
        //calculating the surface area of the box
        area= 2*(height* width)+ 2*(height* length)+2*(width*length);
        //printing the result
        System.out.println("The Volume of the box =   "+volume);
        System.out.println("The Surface area of the box =   "+area);
    }
}
