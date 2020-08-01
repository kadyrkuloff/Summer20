package day27_recap;

import java.util.Arrays;

public class forEachLoop {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5};
      for(int each: arr){
          System.out.print(each+" ");
      }

        System.out.println();
        for (int i = arr.length-1; i >=0; i--){
            System.out.print(arr[i] +" ");
        }
        System.out.println("wmwmwmwmwmwmwmwmwmwmwmwmwmwmwmwmwmwmwmwmwmwm");
        int [] scores = {10,20,30,40,50,60,70,80,90,100,110};
        int countDivBy3 = 0;
        for(int each : scores){
            if(each%3!=0){
                continue;
            }
            countDivBy3++;
            System.out.print(each+ " ");
        }
        System.out.println();
        System.out.println(countDivBy3);
        System.out.println("++++++++++++++++++++++++++++++++");
        String[] names = {"AB", "ABC", "A", "AB", "ABCD"};
        for(String each : names){
            if(!each.contains("C")){
                continue;
            }
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("jnjnfjnejnejnejnejngejnejnejgnejnejnejneejrn");
        int [] score = {80,75,65,110,90,45,56,78};
        int max = score[0];
        int min = score[0];
        for (int each:score) {

            if(min > each){
                min = each;
            }
            if (max < each){
                max = each;
            }

        }
        System.out.println(max);
        System.out.println(min);
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));







    }
}
