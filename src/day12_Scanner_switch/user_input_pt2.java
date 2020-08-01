package day12_Scanner_switch;
import java.util.Scanner;
public class user_input_pt2 {
    public static void main(String[] args) {
        Scanner oOre = new Scanner(System.in);
        System.out.println("enter your number");
        int num1 = oOre.nextInt();
        String result = (num1 % 2 == 0)? num1 + " Even": num1+ " Odd";
        System.out.println(result);


    }
}
