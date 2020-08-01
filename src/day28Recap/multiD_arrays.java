package day28Recap;

import java.util.Arrays;

public class multiD_arrays {
    public static void main(String[] args) {
        int [] arr1D = {1,2,3};
            //            0,1,2   0,1,2,3,4   0,1, 2, 3, 4
        int[][] arr2D = {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};
    //                      0         1             2
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(arr2D[1][3]);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        for (int i=0; i<arr2D.length; i++){
            int[] each1D = arr2D[i];
           // System.out.println(Arrays.toString(each1D));
            for (int j=0;j<=each1D.length-1; j++){
                int eachNum = each1D[j];
                if(eachNum%2==0) {
                    System.out.print(eachNum + " ");
                }
            }
        }
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        for(int [] each1d:arr2D){
            for(int eachElement :each1d ){
                if(eachElement%2!=0) {
                    System.out.print(eachElement + " ");
                }
            }
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        /*
        task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
            task2:
                3 2 1
                4 5 6 7 8
                9 10, 11 12 13
            task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1

         */









    }
}
