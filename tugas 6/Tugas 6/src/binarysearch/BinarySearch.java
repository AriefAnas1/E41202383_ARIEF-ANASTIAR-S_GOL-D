/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Arrays;

/**
 *
 * @author Arief Anastiar S
 */
public class BinarySearch {
    
    public static void binarysearch(int arr[], int first, int last, int key) {
        int n = (first = last) / 2;
        while (first <= last) {
            if(arr[n] < key) {
                first = n + 1;
            }
            else if(arr[n] == key) {
                System.out.println("Element is found at index : " + n);
                break;
            }
            else {
                last = n -1;
            }
            n = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found : ");
        }
    }
    
    public static void main(String[] args) {
        int[] angka = {1,2,3,4,5,6,7,8,9};
        Arrays.sort(angka);
        int target = 7;
        int last = angka.length - 1;
        binarysearch(angka, 0, last, target);
    }
}
