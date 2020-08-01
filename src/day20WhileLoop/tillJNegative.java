package day20WhileLoop;

import java.util.Scanner;

public class tillJNegative {
    /*
    3. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i ==0 ;  ){
            System.out.println("enter number:");
            int num = in.nextInt();
            if (num<0){
                break;
            }
            sum +=num;
        }
        System.out.println(sum);








    }
}
