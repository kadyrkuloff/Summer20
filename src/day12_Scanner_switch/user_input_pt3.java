package day12_Scanner_switch;

import java.util.Scanner;

public class user_input_pt3 {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        System.out.println("enter your first number:");
        int num1 = sum.nextInt();
        System.out.println("enter next number:");
        int num2 = sum.nextInt();
        int result = num1 + num2 ;
        System.out.println("result is " + result);
    }

}
