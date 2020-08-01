package office_hours.july_06_2020;

import java.util.Scanner;

public class fiveNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i<=5; i++){
        System.out.println("enter number");
        int num = in.nextInt();
        sum += num;
        }
        System.out.println(sum);



    }
}
