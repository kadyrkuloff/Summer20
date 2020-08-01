package day18forLoop;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fN = scan.next();
        String lN = scan.next();
        /*String initial = fN.substring(0,1) + lN.substring(0,1);
        initial.toUpperCase();
        System.out.println(initial);*/
        char ch1 = fN.charAt(0); //return char;
        char ch2 = lN.charAt(0);
        String initial = "" + ch1 +". "+ ch2+".";
        initial = initial.toUpperCase();
        System.out.println(initial);
        System.out.println();
    }
}
