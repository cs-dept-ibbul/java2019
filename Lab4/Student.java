/**
 * Write a description of Student here.
 * 
 * @author (Ndaliman Abdullahi Muhammed) 
 * @U15/FNS/CSC/014
 */
public class Student
{
    // instance variables
    private String name;
    private int idNumber;
    private double quiz1,quiz2,quiz3;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int id, double quiz1,double quiz2, double quiz3)
    {
        this.name=name;
        this.idNumber=id;
        this.quiz1=quiz1;
        this.quiz2=quiz2;
        this.quiz3=quiz3;
    }

    //get name
    public String getName(String name)
    {
        return name;
    }
    //get id number
    public int getId(int id)
    {
        return id;
    }
    //get quiz1
    public double getQuizOne(double quiz1)
    {
        return quiz1;
    }
    //get quiz2
    public double getQuizTwo(double quiz2)
    {
        return quiz2;
    }
    //get quiz3
    public double getQuizThree(double quiz3)
    {
        return quiz3;
    }
    //set method for quiz1
    public void setQuizOne(double quiz1){
        this.quiz1=quiz1;
    }
    //set method for quiz2
    public void setQuizTwo(double quiz2){
        this.quiz2=quiz2;
    }
    //set method for quiz3
    public void setQuizThree(double quiz3){
        this.quiz3=quiz3;
    }
    //method to return average of the three quiz
    public double getAverage()
    {
        double average= (getQuizOne(quiz1) + getQuizTwo(quiz2) + getQuizThree(quiz3))/3;
        return average;
    }
    //method to print details of student and scores
    public void printDetails()
    {
        System.out.println("\nStudent Name:  "+getName(name));
        System.out.println("Student ID:  "+getId(idNumber));
        System.out.println("Quiz Grades: "+getQuizOne(quiz1)+"   "+getQuizTwo(quiz2)+"   "+getQuizThree(quiz3));
    }
}
