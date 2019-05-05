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
public class Student{ 
    private String name;
    private int idNumber;
    private double quiz1,quiz2,quiz3;
       public Student(String name, int id, double quiz1, double quiz2, double quiz3) {
    this.name=name;
    this.idNumber=id;
    this.quiz1=quiz1;
    this.quiz2=quiz2;
    this.quiz3=quiz3;
}
       public String getName(String name){
           return name;
       }
       public int getId(int id){
           return id;
       }
       public double getQuizOne(double quiz1){
           return quiz1;
       }
        public double getQuizTwo(double quiz2){
           return quiz2;
        }
         public double getQuizThree(double quiz3){
           return quiz3;
         }
         public void setQuizOne(double quiz1 ){
             this.quiz1=quiz1;
         }
         public void setQuizTwo(double quiz2 ){
             this.quiz2=quiz2;
         }
         public void setQuizThree(double quiz3 ){
             this.quiz3=quiz3;
         }
         public double getAverage(){
             double average= (getQuizOne (quiz1) + getQuizTwo (quiz2)+ getQuizThree (quiz3))/3;
             return average;
         }
         public void printDetails()
    {
        System.out.println("Student Name:  "+getName(name));
        System.out.println("Student ID:  "+getId(idNumber));
        System.out.println("Quiz Grades: "+getQuizOne(quiz1)+"   "+getQuizTwo(quiz2)+"   "+getQuizThree(quiz3));
    }
         }
         
                 
         