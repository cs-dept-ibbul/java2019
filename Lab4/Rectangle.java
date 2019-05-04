
/**
 * Write a description of class Rectangle here.
 * 
 * @author (MUSA ABUSUFYAN YUSUF) 
 * @U15/FNS/CSC/003
 */
class Rectangle {
private double length , width;
public Rectangle(double rectangleLength , double rectangleWidth) {
length = rectangleLength;
width = rectangleWidth;
}
public double area() {
return length * width;
}
// Accessor methods
public double getLength() {
return length;
}
public double getWidth() {
return width;
}
// Mutator methods
public void setLength(double newLength) {
length = newLength;
}
public void setRectangleWidth(float newWidth) {
width = newWidth;
}
}