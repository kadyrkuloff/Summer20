package day22nestedLoop;

import java.util.Scanner;

public class startsEnds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your word");
        String word = in.next();
        char ch1 = word.charAt(0);
         char ch2 = word.charAt(word.length() -1);
         boolean start = ch1>= 'A' && ch1 <= 'Z';
        boolean end = ch2>= 'a' && ch2 <= 'z';
        System.out.println(start && end);



    }
}
