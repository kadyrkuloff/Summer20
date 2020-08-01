package day13_Scanner;

import java.util.Scanner;

public class nextLine_pract {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter house number: ");
        int num = in.nextInt();
        in.nextLine();
        System.out.println("please enter street name:");
        String str = in.nextLine();
        String fullAddress = num + " " + str;
        System.out.println("You are living in this address: " + fullAddress);
        in.close();
    }

}
