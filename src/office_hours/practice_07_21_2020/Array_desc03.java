package office_hours.practice_07_21_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Array_desc03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter how many number you want to enter");
        int size = input.nextInt();//assume 5
        int[] arr = new int[size];
        for(int i= 0; i<=size-1;i++){
            System.out.println("please enter your number ");
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int descArr[]=new int [size];
        int k=arr.length-1;
        for(int each:arr){
            descArr[k] = each;
            k--;
        }
        System.out.println(Arrays.toString(descArr));









    }
}
