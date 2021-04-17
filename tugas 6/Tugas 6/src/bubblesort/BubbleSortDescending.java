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
public class BubbleSortDescending {
    
    static void bubbleSortD(int[] arr) {
        int n = arr.length;
        int temp = 0;
        boolean swap = false;
        int swap_count = 0;
        for (int i =0; i < arr.length; i++) {
            for (int j =i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    
                    //swap elements
                    temp = arr[i];
                    arr[i] = arr[j];
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
            bubbleSortD(arr);
            //sorting array elements using bubble sort
            
            System.out.println("Array Sesudah Bubble Sort Descending : ");
            for (int i =0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}

