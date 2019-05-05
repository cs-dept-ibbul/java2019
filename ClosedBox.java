/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//MATRIC NUMBER:U15/FNS/CSC/061;
//NAME:ALKALI MAMUD;
package ClosedBox;

import java.util.Scanner;
import java.io.IOException;
public class ClosedBox {
public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.print("Enter the length:");
    double length = input.nextDouble();
    System.out.print("Enter the width:");
    double width = input.nextDouble();
    System.out.print("Enter the height:");
    double height = input.nextDouble();
    double volume = length * width * height;
    System.out.println("The volume of the box is:"+volume);
    double surfacearea = 2*(height*width)+2*(height*length)+2*(width*length);
   System.out.println("The surface area of the box is:"+surfacearea);
}
}
