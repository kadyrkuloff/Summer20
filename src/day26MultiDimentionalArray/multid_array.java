package day26MultiDimentionalArray;

import java.util.Arrays;

public class multid_array {
    public static void main(String[] args) {
        char [] ch1 = {'A', 'B'};
        char [] ch2 = {'C', 'D', 'E'};
        char [] ch3 = {'F', 'G', 'H'};
        char[] [] ch2d = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H'} };


        System.out.println(ch2d[2][2]);
        System.out.println(ch2d[1][0]);
        System.out.println(ch2d[2][1]+"  "+ch2d[0][1]);
        System.out.println("V^v^V^v^V^v^V^v^V^v^V^v^V^v^V^v^V^v^V^v^");
        int[] [] arr2D = {  {1,2,3}, {4}, {5,6}, {7,8,9,10}  };

        System.out.println(Arrays.toString(arr2D [3]));

        for(int i = 0; i<= arr2D.length-1; i++){
            System.out.println(Arrays.toString(arr2D[i]));
        }
        System.out.println(Arrays.deepToString(arr2D));


    }
}
