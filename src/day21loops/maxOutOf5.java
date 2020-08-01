package day21loops;

import java.util.Scanner;

public class maxOutOf5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maxResult = -2147483648;
        for(int i = 10; i <= 50; i+=10){
            System.out.println("Please enter your number");
            int num = in.nextInt();
            if(num>maxResult){//if next user entered number bigger then previous it will be assigned
                maxResult = num;
            }
        }
        System.out.println(maxResult);
    }
}
