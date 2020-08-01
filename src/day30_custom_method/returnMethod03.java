package day30_custom_method;

import java.util.Arrays;

public class returnMethod03 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,888,9,0,33};
        int a = max(arr);
        System.out.println(a+" is max");
        int b= min(arr);
        System.out.println(b+" is min");

    }

    public static int max(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }

    public static int min(int [] arr){
        Arrays.sort(arr);
        int min = arr[0];
        return min;
    }




}
