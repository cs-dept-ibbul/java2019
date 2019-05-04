/**
 * Write a description of class BoxDemo here.
 * 
 * @author (Ndaliman Abdullahi Muhammed) 
 * @U15/FNS/CSC/014
 */
public class BoxDemo {
public static void main(String[] args) {
// Create two Box objects
Box box1 = new Box(20.0, 10.0, 15.0);
Box box2 = new Box(6.0, 4.0, 2.0);
double volume, area;
// Get and display volume and surface area of box1
volume = box1.volume();
area = box1.surfaceArea();
System.out.println("The volume of box1 is " + volume + " cubic cm");
System.out.println("The surface area of box1 is "+area+" square cm\n");
// Get and display volume of surface area box2
System.out.println("The volume of box2 is " + box2.volume() + " cubic cm");
System.out.println("The surface area of box2 is "+area+" square cm\n");
}
}
