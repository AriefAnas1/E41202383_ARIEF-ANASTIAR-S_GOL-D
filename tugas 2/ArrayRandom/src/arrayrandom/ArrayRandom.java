/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayrandom;
import java.util.Random;
/**
 *
 * @author Arief Anastiar S
 */
public class ArrayRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random angkaRandom = new Random();
        int hasil;
        
            for ( int counter = 1; counter <= 200; counter++) {
                hasil = + angkaRandom.nextInt(9);
                System.out.printf( "%d ", hasil );
                
                if ( counter % 20 == 0 )
                    System.out.println();
                
            }
    }
    
}
