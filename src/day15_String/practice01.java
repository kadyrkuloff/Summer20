package day15_String;
import java.util.Scanner;
public class practice01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your first name");
        String name = in.next();
        System.out.println("please enter your last name");
        String lastName = in.next();
        char a = name.charAt(0);
        char b = lastName.charAt(0);
        String c = a + ". " + b + ".";
        System.out.println(c);


    }
}
