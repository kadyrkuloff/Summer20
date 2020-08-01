package day21loops;

import java.util.Scanner;

public class minNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int min = 10000000;
        for (int i = 1; i<=5; i++) {
            System.out.println("please enter number");
            int num = in.nextInt();
            if (num<min){//next entered number smaller then previous it will be assigned to min
                min = num;
            }
        }
        System.out.println(min);

    }
}
