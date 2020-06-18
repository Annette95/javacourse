package test;

public class ConvertStringIntoArrayString {

    public static void main(String[] args) {

        String str = "Hello! how are you?";
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
