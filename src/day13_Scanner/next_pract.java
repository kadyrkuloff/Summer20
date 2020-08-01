package day13_Scanner;

import java.util.Scanner;

public class next_pract {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String name = in.next();
        System.out.println("Please enter your last name");
        String lastName = in.next();
        String fullname = name + " " + lastName;
        System.out.println("Greetings comrade " + fullname);

    }
}
