
/**
 * Write a description of class RectangleDemo here.

/ *
 * @author (your name)
 * @version (a version number or a date)
 
*/

public class RectangleDemo
{
    
  public static void main(String[ ] args) {
   
 // Create one Rectangle obj ect
   
 Rectangle rectangle = new Rectangle(20.0, 10.0);
// Get and display the area of rectangle
   
 double area = rectangle. area();
   
 System.out.println("The area of the rectangle is\t" + area + " square cm");
   
 // Get and display the length of rectangle
    
//Note: we cannot use rectangle. length
    
System.out.println("The length of the rectangle is\t" + rectangle. getLength() +" cm");
  
  // Modify the length of rectangle1 to 12. 0
   
 //We must use a mutator method to change the value of a private instance
   
 //variable 
    
rectangle.setLength(12.0);
   
 // Get and display the new length of the rectangle
   
 System.out.println("The new length of the rectangle is " +rectangle.getLength() + " cm");
   
 // Get and display the new area of the rectangle
   
 //System.out.println("The new area of the rectangle is " + rectangle.area() + "square cm\n\n");            

    System.out.println("The new area of the rectangle is "+rectangle.area()+"square cm\n\n");
  
  }

}
