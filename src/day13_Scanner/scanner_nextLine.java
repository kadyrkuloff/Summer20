package day13_Scanner;

import java.util.Scanner;

public class scanner_nextLine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your full name:");
        String fullName = in.nextLine();
        System.out.println("Please enter your company name:");
        String companyName = in.nextLine();
        System.out.println("Full Name: "+fullName);
        System.out.println("Company Name: " + companyName);

    }
}
