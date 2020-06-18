package test;

import java.util.Arrays;
import java.util.Scanner;

public class MinDistance {

    static void smallestDistance(int [] array){
        int smallest = Math.abs(array[0]-array[1]);
        int index = 0;
        for(int i=1; i<array.length-1; i++){
            int value = Math.abs(array[i]-array[i+1]);
            if(value< smallest){
                smallest= value;
                index = i;
            }

        }
        System.out.println(smallest);
        System.out.println(index);

    }

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = s.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Original array: "+ Arrays.toString(arr));
        smallestDistance(arr);
    }
}
