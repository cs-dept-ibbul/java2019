
/**
 * Write a description of class Lab2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lab2
{
    public static void main(String[] args){
        System.out.println("Garba Umar\nU15/FNS/CSC/029");
       String firstName="Amir";
       String middleName="Samir";
       String lastName="Al-Ibrahim";
       int age=20;
       String initials=
       firstName.substring(0,1)+
       middleName.substring(0,1)+
       lastName.substring(3,4);
       
       String password=initials.toLowerCase()+age;
       System.out.printf("Your Password=%-20s",password);
    }
}