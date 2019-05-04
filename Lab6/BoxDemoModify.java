
/**
 * Write a description of class BoxDemoModify here.
 *
 
*@author (MUSA ABUSUFYAN YUSUF)

* @U15/FNS/CSC/003
 
*/
public class BoxDemoModify
{
   public static void main(String[] args){
           // Create two Box obj ects
    BoxModify box1 = new BoxModify(20.0, 10.0, 15.0);
    BoxModify box2 = new BoxModify(box1);
    BoxModify box3 = new BoxModify(6.0);
    double volume, area;
    //double volume, area;         
    // Get and display volume and surface area of box1
    volume = box1.volume();
    area = box1.surfaceArea();
    System.out.println("Box 1 is " + box1);
    System.out.println("Box 2 is "+box2);
    System.out.println("Box 3 is "+box3);
    // Get and display volume of surface area box2
    System.out.println("\nThe volume of box2 is " + box2.volume() + " cubic cm");
    System.out.println("The surface area of box2 is "+area+" square cm\n")