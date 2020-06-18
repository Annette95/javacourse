package test;

import java.util.*;

public class DuplicateElements {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:   ");
        int length = s.nextInt();

        String[] arr = new String[length];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < length; i++) {
            arr[i] = s.next();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        List<String> list = Arrays.asList(arr);
        List<String> duplicates = new ArrayList<>();
        Set<String> withoutDuplicates = new HashSet<>();

        for (String str : list) {
            boolean duplicate = !withoutDuplicates.add(str);
            if (duplicate) {
                duplicates.add(str);
            }
        }

        System.out.println("Without duplicates: " + withoutDuplicates);
        System.out.println("Only duplicates: " + duplicates);
    }

}