
/**
 * Write a description of class Employee1 here.
 * 
 * @author (NDALIMAN ABDULLAHI MUHAMMED) 
 * @U15/FNS/CSC/014
 */

public class Employee1
{
    private int iDNumber;
    private String name;
    private double salary;
    public Employee1(int iD, String employeeName, double employeeSalary){
    iDNumber = iD;
    name = employeeName;
    salary = employeeSalary;
    }
    public Employee1(String employeeName, int iD, double employeeSalary){
    iDNumber = iD;
    name = employeeName;
    salary = employeeSalary;
    }
    public Employee1(int iD, String employeeName) {
    iDNumber = iD;
    name = employeeName;
    salary = 0.0;
    }
    public Employee1(String employeeName, int iD) {
    iDNumber = iD;
    name = employeeName;
    salary = 0.0;
    }
    public void setSalary(double employeeSalary) {
    salary = employeeSalary;
    }
    public int getIDNumber(){
        return iDNumber;
    }
    public String getName() {
    return name;
    }
    public double getSalary() {
    return salary;
    }
    public void deductions(double telephoneBills) {
    salary -= telephoneBills;
    }
    public void deductions(double telephoneBills, double medicalBills) {
    salary -= (telephoneBills + medicalBills);
    }
    public void raiseSalary(double percentIncrease) {
    salary += salary * percentIncrease/100;
    }
    public void printDetails() {
    System.out.println("\nID Number: "+iDNumber+"\nName: "+name+"\nSalary:"
    +salary) ;
    }
}
