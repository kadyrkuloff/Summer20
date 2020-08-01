package day26MultiDimentionalArray;

import java.util.Arrays;

public class sortDescending {
    public static void main(String[] args) {
        int [] arr = {2, 1, 3, 5, 4};

        Arrays.sort(arr);

        int [] desc = new int [arr.length];
        int k = 0;
        for(int i =arr.length-1; i>=0; i--){
            desc[k]=arr[i];
            k++;
        }
        /*
        for(int i = 0; i < arr.length-1; i ++){
            desc[i] = arr[k];
            k--;
        }
         */
        System.out.println(Arrays.toString(desc));











    }
}
