
/**
 * Write a description of class Box here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Box
{
    private double length , width , height; //instance variables
    public Box(double boxLength , double boxWidth , double boxHeight){
        length = boxLength;
        width = boxWidth;
        height = boxHeight;
        }
        public double volume() { //instant methods
        return length * width * height;
        }
        public double surfaceArea() {
        return 2*(length*width + length*height + width*height);
    }
}
