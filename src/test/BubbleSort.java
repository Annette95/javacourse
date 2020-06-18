package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {


     void sort(int [] array){
        int length = array.length;
        for (int i = 0; i < length-1; i++) {
            for (var j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int elem = array[j];
                    array[j] = array[j+1];
                    array[j+1] = elem;
                }
            }
        }
    }

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = s.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Original array: "+ Arrays.toString(arr));
        BubbleSort ob = new BubbleSort();
        ob.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}


