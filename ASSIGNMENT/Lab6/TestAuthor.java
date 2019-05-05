
/**
 * Write a description of class TestArthur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TestAuthor
{
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System. in);
        String name,email;
        char gender;
        System.out.print("Enter Author Name: ");
        name = input.nextLine();
        System.out.print("Enter gender e.g M or F: ");
        gender = input.next().charAt(0);
        input.nextLine();
        System.out.print("Enter email: ");
        email = input.nextLine();
        //any of the following constructors be used to create the object
        Author author = new Author(name, email,gender);
        
        System.out.println(author);
        //enter new email
        System.out.print("\nEnter new email: ");
        email = input.nextLine();
        author.setEmail(email);
        //print new email
        System.out.println(author);
    }
}
