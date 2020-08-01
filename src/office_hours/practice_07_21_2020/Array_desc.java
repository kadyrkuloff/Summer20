package office_hours.practice_07_21_2020;

import java.util.Arrays;

public class Array_desc {
    public static void main(String[] args) {
        int [] arr = {98,97,100,200,55,68,79};

        Arrays.sort(arr);
        int[] descArr = new int [arr.length];
        int k =0;
        for(int i = arr.length-1; i >=0; i--){
            descArr[k] =arr[i];
            k++;
        }
        System.out.println(Arrays.toString(descArr));










    }


















}
