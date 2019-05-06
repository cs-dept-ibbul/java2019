/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;
//Program to break inputed email into username and domain name
public class emailBreak {
	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		String testString,emailAddress;
		boolean check;
		do {
			System.out.println("Please enter your email e.g: example@mail.com");
			emailAddress=userInput.nextLine();
			//String email_regex="[A-Z]+[a-zA-Z_]+@\b([a-zA-Z]+.) {2}\b?.[a-zA-Z]+";
			String email_regex="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			testString=emailAddress;
			check=testString.matches(email_regex);
			if(!check) {
				System.out.println("The email : \""+emailAddress+ "\" is Invalid\n");
				//return;
			}
			
		}while(!check);
			
			String[] parts= emailAddress.split("@");
			System.out.println("\nFor the email address: "+emailAddress);
			System.out.println("The user name is   : "+parts[0]+"\nThe domain name is : "+parts[1]);
	}
}


