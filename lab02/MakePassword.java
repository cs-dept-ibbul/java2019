
/**
 * Write a description of class MakePassword here.
 *
 * @author (Memunat Manzuma)
 * @version (a version number or a date)
 */
public class MakePassword
{
   public static void main (String[] args){
      String FirstName = "Memunat";
      String MiddleName = "Nnakodindi";
      String LastName = "Manzuma";
      int age = 26;
      
      //extract initials
      String initials =
            FirstName.substring(0,1)+
            MiddleName.substring(0,1)+
            LastName.substring(3,4);
            
      //append age
      String password = initials.toLowerCase() +age;
      System.out.prinf("Your Password =%20s",password);
            
    }
}
