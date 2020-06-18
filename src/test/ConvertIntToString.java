package test;

import java.util.Arrays;

public class ConvertIntToString {


    public static void intToString(int a) {
        String str = Integer.toString(a);
        System.out.println("Converted from int to string: " + str);
        System.out.println("Join two types: " + a + str);
        System.out.println("String contains chosen number: " + str.contains("2"));
        System.out.println("String length: " + str.length());
    }

    public static void charArrayToString(char[] b) {
        String string = new String(b);
        System.out.println("Converted from char array to string: " + string);
        System.out.println("Join two types: " + Arrays.toString(b) + string);
    }

    public static void main(String[] args) {
        intToString(12121);
        char[] chars = {'c', 'f', 'c'};
        charArrayToString(chars);
    }

}