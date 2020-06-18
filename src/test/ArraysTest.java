package test;

public class ArraysTest {

    public static void main (String[] args){
        int[] array = {2,3,4,5,9,6,7,8,11,14};
        int [] array2 = new int[array.length];
        for (int index=array.length-1; index>=0; index--){
//            System.out.println(array[index]);
            array2[index] = array[index];
        }

        for (int index: array2){
            System.out.println(array2[index]);
        }
    }
}
