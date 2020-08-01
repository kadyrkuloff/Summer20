package office_hours.july082020;

import java.util.Scanner;

public class maxNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = -1000000;
        /*for (int i = 1; i <= 5; i++){
            System.out.println("please enter your number");
            int num = in.nextInt();
            if(num>max){
                max = num;

            }
        }*/
        int i = 1;
        while (i<=5){
            System.out.println("please enter your number");
            int num = in.nextInt();
            if(num>max) {
                max = num;
            }
            i++;
        }
        System.out.println(max);

    }
}
