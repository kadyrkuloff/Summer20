package day19Loop;

import java.util.Scanner;

public class sumOfNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i, sum = 0;
        if (a > 1) {
            for (i = 0; i <= a; i++) {
                sum += i;
            }
            System.out.println(sum);
        }else{
            System.out.println("invalid number");
        }

        }
    }
