package day33_LocalDateTime;

import java.util.Arrays;

public class sortDescending {


    public static void main(String[] args) {
        int[] arr= {1,2,4,3,5,6,9,8,7};
        System.out.println(Arrays.toString(sortDesc(arr)));
        double[] arr2= {1.5,2.4,4.3,3.2,5.1,6.6,9.9,8.8,7.7};
        System.out.println(Arrays.toString(sortDesc(arr2)));

    }


    public static  int[] sortDesc(int a[]){
        Arrays.sort(a);
        int[] arr2 = new int[a.length];
        int k = 0;
        for(int i = a.length-1; i>=0; i--) {
            arr2[k] += a[i];
            k++;
        }

      return arr2;
    }


    public static  double[] sortDesc(double a[]){
        Arrays.sort(a);
        double[] arr2 = new double[a.length];
        int k = 0;
        for(int i = a.length-1; i>=0; i--) {
            arr2[k] += a[i];
            k++;
        }

        return arr2;
    }
















}
