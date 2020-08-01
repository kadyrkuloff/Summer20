package day23Arrays;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner in = new Scanner(System.in);
        System.out.println("please enter number between 1 - 12");
        int num = in.nextInt();
        System.out.println(months[num -1]);
    }
}
