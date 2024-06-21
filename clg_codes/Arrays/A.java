package clg_codes.Arrays;
public class A {
    public static void main(String[] args) {
        // there are three ways how we can declare an array in java
        // declaration 1:
        int[] arr = new int[2]; // declaring with the sizec 
        
        arr[0] = 1;
        arr[1] = 2;

        // declaration 2:
        int[] arr1; // declaring without the size
        arr1 = new int[2];
        arr1[0] = 1;
        arr1[1] = 2;

        // declaration 3:
        int[] arr2 = { 1, 2 }; // declaration and initialization
        System.out.println(arr[0]);
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println("length of the array1 = "+arr1.length);
    }
}
