/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;
/**
 *
 * @author Arief Anastiar S
 */
public class BubbleSortAscending {
    
    static void bubbleSortA(int[] arr) {
        int n = arr.length;
        int temp = 0;
        boolean swap = false;
        int swap_count = 0;
        for (int i =0; i < n; i++) {
            for (int j =1; j < (n-i); j++) {
                if (arr[j-1] > arr[j]) {
                    
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    
                    swap = true;
                    if(swap) {
                        swap_count++;
                    }
                }
            }
        }
        System.out.println("Jumlah Perbandingan : " + swap_count);
    }    
        public static void main(String[] args) {
        int[] arr = {2,6,4,7,9,6,1};
        
        System.out.println("Array Sebelum Bubble Sort : ");
        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            System.out.println();
            bubbleSortA(arr);
            //sorting array elements using bubble sort
            
            System.out.println("Array Sesudah Bubble Sort Ascending : ");
            for (int i =0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}
