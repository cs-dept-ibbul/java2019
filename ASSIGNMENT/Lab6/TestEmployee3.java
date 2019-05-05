
/**
 * Write a description of class TestEmployee3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TestEmployee3
{
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System. in);
        int number;
        String name;
        double salary;
        System.out.print("Enter Name for Employee 1: ");
        name = input.nextLine();
        System.out.print("Enter ID Number for Employee 1: ");
        number = input.nextInt();
        System.out.print("Enter Salary for Employee 1: ");
        salary = input.nextDouble();
        //any of the following constructors be used to create the object
        Employee3 emp1 = new Employee3(number, name, salary);
        // or Employee1 emp1 = new Employee1(name, number, salary) ;
        input.nextLine();
        System.out.print("\nEnter Name for Employee 2: ");
        name = input.nextLine();
        //input.nextLine();
        System.out.print("Enter ID Number for Employee 2: ");
        number = input.nextInt();
        //if we do not know the salary, we can use one of the following constructors
        Employee3 emp2 = new Employee3(number, name);
        //or Employee1 emp2 = new Employee1(name, number) ;
        emp2.setSalary(emp1.getSalary());
        emp1.deductions(50);
        emp2.deductions(60, 40);
        //emp1.printDetails();
        //emp2.printDetails();
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
