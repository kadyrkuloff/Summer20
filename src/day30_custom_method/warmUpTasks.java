package day30_custom_method;

import java.util.Arrays;

public class warmUpTasks {

    /*
    1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
     */
    public static void main(String[] args) {
        maxNum(33,33);
       int[] arr = {1,2,33,44,55,66,77,888,95,43};
        descendingArray(arr);
        int []a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,10,11,12};
        combine2Array(a1,a2);
        PosNegZero(-00);
        int[] a3 = {100,-100,-200,-300,0,0,900,5000};
        for(int each : a3){
            PosNegZero(each);
        }
    }

    //task 01
    public static void maxNum(int a, int b){

        if(a==b){
            System.out.println("equal");
            return;
        }

        if(a>=b){
            System.out.println(a+ " is max");
        }else{
            System.out.println(b+ " is max");
        }
    }

    //task 02
    public static void descendingArray(int[] arr){
        Arrays.sort(arr);
        for(int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //task 03
    public static void combine2Array(int[]arr1, int[]arr2){
        int arr3[] = new int [arr1.length + arr2.length];
        int i = 0;
        for(int each: arr1){
            arr3[i] = each;
            i++;
        }
        for(int each:arr2){
            arr3[i] = each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));
    }

    //task 04
    public static void PosNegZero(int num){
        if(num>0){
            System.out.println(num+ " is positive");
        }else if(num<0){
            System.out.println(num+ " is negative");
        }else{
            System.out.println(num+ " is zero");
        }
    }


























}