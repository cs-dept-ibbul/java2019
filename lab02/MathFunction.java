
/**
 * Write a description of class MathFunction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//a program that will display value of Cos, Exp, Sin, Absolute value and tan
public class MathFunction {
	public static void main(String[] args) {
		double k;
		k =2/4*4%3;
		//converting from degrees to radian
		double cos=Math.cos(Math.toRadians(30)); 
		double sin=Math.sin(Math.toRadians(30));
		double tan=Math.tan(Math.toRadians(30));
		
		System.out.println("The value of cos 30: "+cos);
		System.out.println("The value of exp(15): "+Math.exp(15));
		System.out.println("The value of sin 30: "+sin);
		System.out.println("The absolute value of k is "+Math.abs(k));
		System.out.println("The value of tan 30: "+tan);
	}

 }

