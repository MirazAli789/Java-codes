package clg_codes.Arrays;
//An array is a linear homgeneous and contiguos memory based data structure
public class intro {
    public static void main(String[] args) {
        // declaring an array
        // int[] arr = new int[5];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 2;
        // arr[4] = 3;
        // System.out.println(arr[4]);

        // int [] arr1 = new int[3];
        // arr1[0] = 1;
        // arr1[1] = 2;
        // arr1[2] = 3;
        // for(int i=0;i<3;i++){
        //     System.out.println(arr1[i]+" ");
        // }

        // another way of declaring array along with initializing
        int [] arr2 = {1,2,3,4,5};
        System.out.println(arr2[0]);
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2);
        }
    }
}
