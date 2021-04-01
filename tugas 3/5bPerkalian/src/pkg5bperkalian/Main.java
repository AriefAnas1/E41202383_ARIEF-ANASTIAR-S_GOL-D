/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5bperkalian;

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
        System.out.println("");
        System.out.println("Bilangan perkalian 2 (0-100)");
        System.out.println("============================");
        int j = 0;
        do{
            if(j==0){
            j = 1;            
        }
            else{
                System.out.print(j * 2 + "");
            }
            
            j++;
            
        }
        while(j <= 100);
    }
    
}
