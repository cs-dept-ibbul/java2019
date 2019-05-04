
/**
 * Write a description of class Employee2 here.
 * 
 * @author (NDALIMAN ABDULLAHI MUHAMMED) 
 * @U15/FNS/CSC/014
 */

public class Employee2
{
    private int iDNumber;
    private String name;
    private double salary;
    public Employee2(int iDNumber, String name, double salary) {
    this.iDNumber = iDNumber;
    this.name = name;
    this.salary = salary;
    }
    public Employee2(String name, int iDNumber, double salary) {
    this(iDNumber, name, salary);
    }
    public Employee2(int iDNumber, String name) {
    this(iDNumber, name, 0.0);
    }
    public Employee2(String name, int iDNumber) {
    this(iDNumber, name, 0.0);
    }
    public void setSalary(double salary) {
    this.salary = salary;
    }
    public int getIDNumber() {
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
        System.out.println("\nID Number: "+iDNumber+"\nName: "+name+"\nSalary:"+salary);
    }
}
  