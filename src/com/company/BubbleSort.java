package com.company;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        System.out.println("Array After Bubble Sort");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

        bubbleSort(new int[]{3,60,35,2,45,320,5});//sorting array elements using bubble sort

    }
}
