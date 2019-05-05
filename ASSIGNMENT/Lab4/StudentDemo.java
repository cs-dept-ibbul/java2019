import java.util.Scanner;
public class StudentDemo
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();
        
        System.out.println("Please enter your ID");
        int id = input.nextInt();
        
        System.out.println("Please enter your Quiz Grades");
        System.out.println("Quiz 1: ");
        double q1 = input.nextInt();
        
        System.out.println("Quiz 2: ");
        double q2 = input.nextInt();
        
        System.out.println("Quiz 3: ");
        double q3 = input.nextInt();
        
        Student student = new Student(name, id, q1, q2, q3);
        
        student.printDetails();
        
        System.out.println("Enter new grade for quiz 3: ");
        student.setQuizThree(input.nextDouble());
        
        student.printDetails();
         
    }
}
