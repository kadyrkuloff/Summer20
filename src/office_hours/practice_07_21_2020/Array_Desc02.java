package office_hours.practice_07_21_2020;

import java.util.Arrays;

public class Array_Desc02 {
    public static void main(String[] args) {

        int[] arr = {98, 97, 100, 200, 55, 68, 79};

        Arrays.sort(arr);
        int[] arrDesc = new int [arr.length];
        int k=arr.length-1;
        for(int each:arr){
            arrDesc[k] = each;
            k--;
        }
        System.out.println(Arrays.toString(arrDesc));











    }
}
