import java.util.Scanner;
public class QuestionTwo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your e-mail address ");
        String email = input.nextLine();
        User user = new User();
        user.readEmail(email);
        System.out.println("User Name is: " + user.userName);
        System.out.println("Domain Name is: " + user.domainName);
    }
}
