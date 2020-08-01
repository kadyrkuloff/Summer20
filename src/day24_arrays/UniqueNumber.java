package day24_arrays;

import java.util.Arrays;

public class UniqueNumber {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3};
        String result = "";

        for (int i = 0; i <= arr.length - 1; i++) {

            int num = arr[i];
            int count = 0;
            for (int e = 0; e< arr.length; e++){
                int frNum = arr[e];
                if (frNum == num){
                    count++;
                }
            }

            if (count ==1){
                System.out.println(num);;
            }

        }




    }
}
