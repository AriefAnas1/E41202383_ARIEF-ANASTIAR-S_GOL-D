/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5b;

/**
 *
 * @author Arief Anastiar S
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Do While");
        System.out.println("Bilangan kelipatan 2(1-100)");
        System.out.println("===========================");
        int i = 1;
        do{
            System.out.println(i + "");
            i =i*2;
        }
        while(i<=100);
    }
    
}