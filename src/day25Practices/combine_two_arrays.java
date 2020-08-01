package day25Practices;

import java.util.Arrays;

public class combine_two_arrays {
    public static void main(String[] args) {

        //arrays
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4,5};

        //setting size of expected array
        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];

        //initializing variable index in order to assign inside of loop
        int index = 0;

        //loop for assigning data from arr1
        for(int each:arr1){
            arr3[index] = each;
            index++;
        }

        //loop for assigning data from arr2
        for(int each:arr2){
            arr3[index] = each;
            index++;
        }

        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println("Max number is " + arr3[arr3.length-1]);


    }
}
