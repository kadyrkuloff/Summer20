package day16_string;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        /*you have 2 words that must be 5 characters, and check if last letter of
        first word and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"*/
        Scanner in = new Scanner(System.in);
        System.out.println("please enter two words:");
        String a = in.next();
        String b = in.next();
        boolean c = a.length() == 5 && b.length() == 5;
        /*if (c){
            char ch1 = a.charAt(a.length()-1);
            char ch2 = b.charAt(0);
            if (ch1 == ch2){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz");
            }

        }else{
            System.out.println("need to be exact 5 chars length");
        }*/
        if (c){
            if (a.endsWith("" +b.charAt(0))  && b.startsWith(""+a.charAt(a.length()-1))){
                System.out.println("fizz");
            }else{
                System.out.println("buzz");
            }
        }else{
            System.out.println("need to be exact 5 chars length");
        }









    }
}
