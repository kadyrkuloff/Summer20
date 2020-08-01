package day16_string;

import java.util.Scanner;

public class practice02_1st_last {
    public static void main(String[] args) {
      /*  String str = "I like to drink Shoro";
        String drink = str.substring(16);
        String action = str.substring(10,14+1);
        System.out.println(drink);
        System.out.println(action);*/
        /*Ask user to enter a word. Print true is the first and last
        characters of the string are same characters, print false otherwise.
        Input:
        abba
        Output:
        true*/
        Scanner in = new Scanner(System.in);
        System.out.println("enter word por favor");
        String w1 = in.next();
        char ch1 = w1.charAt(0);
        char ch2 = w1.charAt(w1.length() - 1);
        System.out.println(ch1 == ch2);


    }
}
