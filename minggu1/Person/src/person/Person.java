/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Arief Anastiar S
 */
import java.util.Scanner;
public class Person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         System.out.println("FName = ");
         String fname = input.next();
         
         
         System.out.println("LName = ");
         String lname = input.next();
         
         
         System.out.println("Studentid = ");
         String stuld = input.next();
         
         
         System.out.println("Status = ");
         String stuStatus = input.next();
         
         
    }    

    Person(String arial, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean getAge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
