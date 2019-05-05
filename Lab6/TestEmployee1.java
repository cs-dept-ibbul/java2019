
/**
 * Write a description of class TestEmployee1 here.
 * 
 * @author (NDALIMAN ABDULLAHI MUHAMMED) 
 * @U15/FNS/CSC/014
 */

import java.util.Scanner;
public class TestEmployee1
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
        Employee1 emp1 = new Employee1(number, name, salary);
        input.nextLine();
        System.out.print("\nEnter Name for Employee 2: ");
        name = input.nextLine();
        System.out.print("Enter ID Number for Employee 2: ");
        number = input.nextInt();
        Employee1 emp2 = new Employee1(number, name);
        emp2.setSalary(emp1.getSalary());
        emp1.deductions(50);
        emp2.deductions(60, 40);
        emp1.printDetails();
        emp2.printDetails();
    }
}

