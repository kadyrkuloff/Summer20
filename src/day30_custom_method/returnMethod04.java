package day30_custom_method;

import java.util.Arrays;

public class returnMethod04 {

    public static void main(String[] args) {
        int[] a1 = {1,2,3};
        int[] a2 = {4,5,6};
        int[] a3 = combine2Array(a1,a2);
        System.out.println(Arrays.toString(a3));
        System.out.println(a3[0]);
    }


    public static int[] combine2Array(int[]arr1, int[]arr2) {
        int arr3[] = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            arr3[i] = each;
            i++;
        }
        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }
        return arr3;
    }












}
