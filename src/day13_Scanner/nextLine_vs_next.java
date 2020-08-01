package day13_Scanner;

import java.util.Scanner;

public class nextLine_vs_next {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your salary:");
        double salary = in.nextDouble();
        in.nextLine();
        System.out.println("please enter your full name:");
        String fullName = in.nextLine();
        System.out.println("salary is $ " + salary);
        System.out.println("full name is: " + fullName);

    }
}
