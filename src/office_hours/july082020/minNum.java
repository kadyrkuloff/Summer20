package office_hours.july082020;

import java.util.Scanner;

public class minNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = 10000000;
        int max = -10000000;
        /*for (int i = 0; i < 5; i++ ){
            System.out.println("please enter your number");
            int num = in.nextInt();
            if (num<min){
                min = num;
            }

        }
        System.out.println(min);*/
        int i = 0;
        while (i<5){
            System.out.println("please enter your number");
            int num = in.nextInt();
            if (num<min){
                min = num;
            }
            if(num>max){
                max = num;
            }
            i++;
        }
        System.out.println(min);
        System.out.println(max);



    }
}
