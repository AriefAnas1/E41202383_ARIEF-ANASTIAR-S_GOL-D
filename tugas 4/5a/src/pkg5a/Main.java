/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5a;

import java.util.Arrays;
import java.util.Scanner;

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
        Scanner s = new Scanner(System.in);
        int panjang = 0;
        System.out.print("masukkan panjang nilai : ");
        panjang = s.nextInt();
        int[] angka = new int[panjang];
        
        for(int i =0; i < panjang; i++){
            System.out.print("masukkan nilai ke-" + i + ":");
            angka[i] = s.nextInt();
        }
        
            System.out.print("[");
            for(int i:angka){
                System.out.print(i + "");
            }
                System.out.println("]");
                
        Arrays.sort(angka);
            System.out.println("Nilai setelah diurutkan dari yang terkecil-terbesar");
            System.out.println("===================================================");
            System.out.print("[");
            for(int i:angka){
                System.out.print(i + "");
            }
            System.out.print("]");
        
    }
    
}
