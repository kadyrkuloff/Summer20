package day16_string;
import java.util.Scanner;
public class practice01_substring {
    /*
    Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st word");
        String w1 = in.next();
        System.out.println("Enter 1st word");
        String w2 = in.next();
        int l1 = w1.length();
        int l2 = w2.length();
        String c1 = w1.substring(1);
        String c2 = w2.substring(1);
        String result = c1 + c2;
        System.out.println(result);







    }

}
