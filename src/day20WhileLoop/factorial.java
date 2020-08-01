package day20WhileLoop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        /*
        Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120
         */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = 1;
        for (int i = num; i >= 1; i--){//5,4,3,2,1
            result *= i;
        }
        System.out.println(result);






    }
}
