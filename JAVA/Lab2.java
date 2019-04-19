
/**
 * Write a descri
 * ption of class Lab2 here.
 * 
 * @author (U16/FNS/CSC/2079) 
 */
import java.util.Random;
public class Lab2
{
  public static void main(String[]args){
      double miles=10.5;
       miles=10.5;
        miles++;
         System.out.println("\nEXERCISES 01a MILES");
          System.out.println("The correct value of miles is now: "+miles+"\n");   
System.out.println("\bEXERCISES 01b COMPUTE XYZ");    
  double x,y,z;
   int a= 1; double d= 1.0;
    x= d+43%5*(23*3%2);
     y= 1.5*3+(++a);
      z= 3+d*d+4;
       System.out.println("The value of x: "+x);
        System.out.println("The value of y: "+y);
         System.out.println("The value of z: "+z);        
System.out.println("\nEXERCISES 01c R= Math.log(P) ");
    double R,P;
       P=3.758;
        R= Math.log(P);
          System.out.println("The solution = "+R);
System.out.println("\nEXERCISES 02 MATHFUNCTION");
    double k;
        k=2/4*4%3;
         //converting from degrees to radian
            double cos=Math.cos(Math.toRadians(30)); 
             double sin=Math.sin(Math.toRadians(30));
              double tan=Math.tan(Math.toRadians(30));
               System.out.println("The value of cos 30: "+cos);
                System.out.println("The value of exp(15): "+Math.exp(15));
                 System.out.println("The value of sin 30: "+sin);
                  System.out.println("The absolute value of k is "+Math.abs(k));
                   System.out.println("The value of tan 30: "+tan);
System.out.println("\nEXERCISES 03 USERNAME&DOMAIN");
    String email,domain,username;
     email = "Phoenixkheeng@gmail.com";
     username = email.split("@")[0];
       domain = email.substring(email.indexOf("@")+1);
        //username = email.substring(email.indexOf("@")-1);
         System.out.println("The email address==> Phoenixkheeng@gmail.com");			
          System.out.println("Username:"+ username); 
           System.out.println("Domain:"+ domain);
System.out.println("\nEXERCISES 04 FILENAME&EXTENSION");
    String path;
        path = "d:phoenixkheeng/work/lab2.java";
		  int index=path.lastIndexOf("/");
		   int ext=path.lastIndexOf(".");
		    String fileName=path.substring(index+1, ext);
			 String filePath=path.substring(0, index);
			  String fileExt=path.substring(ext+1);
			   System.out.println("This is the path entered ==> d:phoenixkheeng/work/lab2.java");
			    System.out.println("The Fullname: "+path);
				 System.out.println(" The Directory: "+filePath+" \n The Filename: "+fileName+" \n The Extension: "+fileExt);		
System.out.println("\nEXERCISES 05 PASSWORD GENERATOR");
    String firstName = "Olaitan";
     String middleName = "Odebode";
      String lastName = "Mariam";
       Random rand = new Random();
        for(int icount=0;icount<10;icount++){
         int randomNumber = rand.nextInt(100);
        }
        int age = 22;
        // int zaa = age+randomNumber;
          //extract initials
           String initials =
            firstName.substring(0,1)+
             middleName.substring(0,1)+
              lastName.substring(3,4);
              //append age
               String password =(initials.toLowerCase());
               //password+randomNumber;
                System.out.println("Your Password = "+password);

    }   
}
