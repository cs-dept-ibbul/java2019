/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//MATRIC NUMBER:U16/FNS/CSC/2087
//NAME:Abdullahi idris;
package TestAuthor;

public class TestAuthor {
   public static void main(String[] args) {
      Author auth = new Author("Alkali Mamud "Mamudalkakli@yahoo.com", 'm');
      System.out.println(auth); 
      auth.setEmail("mamudalkali@yahoo.com");
      System.out.println(auth);
      System.out.println("name is: " + auth.getName());
      System.out.println("gender is: " + auth.getGender());
      System.out.println("email is: " + auth.getEmail());
   }
}
