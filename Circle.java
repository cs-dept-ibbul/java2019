/**
 * Write a description of class Lab3 here.
 * 
 * @ jesse john zubakpere u15/fns/csc/082
 */
public class Circle
{
private static int numberOfCircles = 0;
private double radius;
public Circle(double circleRadius) {
numberOfCircles++;
radius = circleRadius;
}
public double area() {
return Math.PI * radius * radius;
}
public double circumference() {
return 2.0 * Math.PI * radius;
}
public static int getNumberOfCircles() {
return numberOfCircles;
}
}
