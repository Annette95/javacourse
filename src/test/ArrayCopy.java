package test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = s.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < length; i++) {
            arr[i] = s.nextInt();
        }

        // 1st method to copy an array
        System.out.println("Original array: " + Arrays.toString(arr));
        int copyArray[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            copyArray[i] = arr[i];
        System.out.println("1st method - copied array: " + Arrays.toString(copyArray));

        // 2nd method to copy an array
        int[] copy_Array = Arrays.copyOf(arr, arr.length);
        System.out.println("2nd method - copied array: " + Arrays.toString(copy_Array));

        //3rd method to copy an array
        int clone_Array[] = arr.clone();
        System.out.println("3rd method - copied array: " + Arrays.toString(clone_Array));

        //4th method to copy an array
        int[] copyArray_4 = Arrays.copyOfRange(arr, 0, arr.length);
        System.out.println("4th method - copied array: " + Arrays.toString(copyArray_4));

        //5th method of copy an array
        int copyArray_5[] = new int[arr.length];
        copyArray_5 = arr;
        System.out.println("5th method - copied array: " + Arrays.toString(copyArray_5));

    }
}

