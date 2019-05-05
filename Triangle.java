/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//MATRIC NUMBER:U16/FNS/CSC/2087
//NAME:Abdullahi idris
package triangle;
import java.util.Scanner;
public class Triangle {
public static void main(String[] args) {
Scanner Input=new Scanner(System.in);double a,b,c,p,s,longest,smallest,remainder,area;
System.out.print("Enter the value of side a ");
a=Input.nextDouble();
System.out.print("Enter the value of side b ");
b=Input.nextDouble();
System.out.print("Enter the value of side c ");
c=Input.nextDouble();
p=a+b+c;
s=(a+b+c)/2;
area=Math.sqrt(s*(p-a)*(s-b)*(s-c));
if( a >= b && a >= c){
longest=a;
}
else if (b >= a && b >= c){
longest=b;
}
else{
longest=c;
}
if( a <= b && a <= c){
smallest=a;
}
else if (b <= a && b <= c){
smallest=b;
}
else{
smallest=c;
}
remainder=longest%smallest;
System.out.println("The perimeter of triangle is "+p);
System.out.println("The area of triangle with sides a= "+a+" b= "+b+" c= "+c+" is "+String.format("%.2f",area)+"units");
System.out.println("The longest side is: "+longest);
System.out.println("The smallest side is: "+smallest);
System.out.println("The remainder is: "+remainder);

}
}
