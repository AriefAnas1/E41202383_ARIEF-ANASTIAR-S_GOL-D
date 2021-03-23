/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintakseswitchcase;

import java.util.Scanner;

/**
 *
 * @author Arief Anastiar S
 */
public class SintaksEswitchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nomor;
        String nama;
        Scanner masuk = new Scanner(System.in);
        System.out.println("                CAFE CERIA ");
        System.out.println("               ANEKA MINUMAN");
        System.out.println("----------------------------------------------------");
        System.out.println("                SPECIAL MENU");
        System.out.println("            1.  Soft Drinks");
        System.out.println("            2.  Mix juice");
        System.out.println("            3.  Nescafe");
        System.out.println("            4.  Soda milk");
        System.out.println("            5.  tea");
        System.out.println("----------------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        nama = masuk.nextLine();
        System.out.println("");
        System.out.print("Silahkan masukkan pilihan anda :");
        int nomer = masuk.nextInt();
        switch (nomer) {
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft Drinks");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih " + nama + "telah berkunjung di Cafe Ceria");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih " + nama + "telah berkunjung di Cafe Ceria");
                break;    
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih " + nama + "telah berkunjung di Cafe Ceria");
                break; 
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda Milk");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih " + nama + "telah berkunjung di Cafe Ceria");
                break; 
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih " + nama + "telah berkunjung di Cafe Ceria");
                break;
            default:
                System.out.println("Nomer tidak tersedia dalam Menu");
                System.out.println("Silahkan coba lagi!");
                
        }
    }
    
}
