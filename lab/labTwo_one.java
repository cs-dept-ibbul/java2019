package practicalClass;

//program to print miles, values of X,Y,Z and also log of a value
public class labTwo_one {
	public static void main(String[] args) {
		//Lab2 question 1(a)
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
		
		//Lab2 question 1(c)
		double R,p=3.758;
		R=Math.log(p); //R=log(3.758)
		System.out.println("\n\nR=log(p) \nR ="+R); 
	}

}
