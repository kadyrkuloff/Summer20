package day15_String;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter sentence:");
        String a = in.nextLine();
        int b = a.length() - 1;
        char l = a.charAt(b);
        char c = a.charAt(0);
        System.out.println("first character is "+ c +" and second character is " + l);





    }
}
