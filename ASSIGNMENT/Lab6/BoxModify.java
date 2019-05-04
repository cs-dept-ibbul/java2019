
/**
 * Write a description of class BoxModify here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BoxModify
{
        private double length , width , height; //instance variables
        public BoxModify(double boxLength , double boxWidth , double boxHeight) { //constructor
        length = boxLength;
        width = boxWidth;
        height = boxHeight;
        }
        public BoxModify(BoxModify obj) { //constructor
        length = obj.length;
        width = obj.width;
        height = obj.height;
        }
        public BoxModify(double boxLength) { //constructor
        length = boxLength;
        width = boxLength;
        height = boxLength;
        }
        public double volume() { //instant methods
        return length * width * height;
        }
        public double surfaceArea() {
        return 2*(length*width + length*height + width*height);
        }
        public double getLength( ){
            return length;
        }
        public double getWidth(){
            return width;
        }
        public double getHeight(){
            return height;
        }
        public String toString() {
        return "\nLength: "+getLength()+"   Width: "+getWidth()+"   Height:"+getHeight();
    }
}
