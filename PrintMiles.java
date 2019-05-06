
/**
 * Write a description of class PrintMiles here.
 *
 * @author
 * @version (a version number or a date)
 */
public class PrintMiles
{
    public static void main(String[] args) {
        double miles=10.5;
		miles++;
		System.out.println("The current value of miles is now: "+miles);
		//Lab2 question 1(b) 
		double X,Y,Z,d=1.0;
		int a=1;
		X=d+ 43 % 5*(23*3%2);
		Y=1.5 *3 +(++a);
		Z=3 +(d*d)+4;
		System.out.println("\n\nX ="+X+"\nY ="+Y+"\nZ ="+Z);
		
		double R,p=3.758;
		R=Math.log(p);
		System.out.println("\n\nR=log(p) \nR ="+R); 
    }
}
