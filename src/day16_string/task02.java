package day16_string;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String a = input.next();
        System.out.println("Enter second word");
        String b = input.next();
        String ab = (a.equalsIgnoreCase(b))? "They are equal" : "They are not equal";
        System.out.println(ab);


    }
}
