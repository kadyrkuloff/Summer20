package day21loops;

import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = -1000000;//any user input will be greater then this num
        int min = 1000000;//any user input will be lesser than this num

        for (int i = 1; i <= 5; i++){
            System.out.println("Enter a number");
            int num = in.nextInt();
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }

        }
        System.out.println("min entered number is: "+min);
        System.out.println("max entered number is: "+max);
    }
}
