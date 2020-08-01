package day16_string;
import java.util.Scanner;
public class practice08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Are you employeed");
        String input = in.next();
        if (input.equalsIgnoreCase("yes")){
            System.out.println("employeed");
        }else{
            System.out.println("not employeed");
        }

    }
}
