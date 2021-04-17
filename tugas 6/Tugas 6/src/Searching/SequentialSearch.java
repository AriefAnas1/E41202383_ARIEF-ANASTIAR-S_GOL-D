/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Arrays;

/**
 *
 * @author Arief Anastiar S
 */
public class SequentialSearch {
    
    static void sequentialsearch(int[] arr, int search) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
            }
        }
        
        System.out.println("Data berada pada index : " + index);
    }
    
    public static void main(String[] args) {
        int[] angka = {1,2,3,4,5,6,7,8,9};
        Arrays.sort(angka);
        sequentialsearch(angka, 9);
    }
}
