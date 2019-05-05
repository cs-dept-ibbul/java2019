package practicalClass;

//program to carry out sin,cos,tan,abs,exp mathematical functions
public class labTwo_mathFunction {
	public static void main(String[] args) {
		double k;
		k=2/4*4%3;
		//converting from degrees to radian
		double cos=Math.cos(Math.toRadians(30)); 
		double sin=Math.sin(Math.toRadians(30));
		double tan=Math.tan(Math.toRadians(30));
		//********* output *********** 
		System.out.println("The value of cos 30: "+cos);
		System.out.println("The value of exp(15): "+Math.exp(15));
		System.out.println("The value of sin 30: "+sin);
		System.out.println("The absolute value of k is "+Math.abs(k));
		System.out.println("The value of tan 30: "+tan);
	}

}
