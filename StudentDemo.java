/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemo;

/**
 *
 * @author hp
 */
//MATRIC NUMBER:U15/FNS/CSC/061
//NAME:ALKALI MAMUD
import java.util.Scanner;
public class StudentDemo {

    public static void main(String[] args) {
        String name;
        int idNumber;
        double quiz1,quiz2,quiz3;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Student name:");
        name=input.nextLine();
        System.out.println("Enter Student ID:");
        idNumber=input.nextInt();
        System.out.print("Enter Quiz1 score: ");
        quiz1=input.nextDouble();
        System.out.print("Enter Quiz2 score: ");
        quiz2=input.nextDouble();
        System.out.print("Enter Quiz3 score: ");
        quiz3=input.nextDouble();
        Student study =new Student(name,idNumber,quiz1,quiz2,quiz3);
        study.printDetails();
        System.out.println("Average: "+study.getAverage());
        
        System.out.println("Enter new score for quiz3: ");
        quiz3=input.nextDouble();
        study.setQuizThree(quiz3);
        
        study.printDetails();
        System.out.println("Average: "+study.getAverage());    
    }
    
}
