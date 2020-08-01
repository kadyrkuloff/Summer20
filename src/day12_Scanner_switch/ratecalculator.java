package day12_Scanner_switch;
import java.util.Scanner;
public class ratecalculator {
    public static void main(String[] args) {
        Scanner rate = new Scanner(System.in);
        System.out.println("please enter your Salary");
        double salary = rate.nextDouble();
        System.out.println("please enter amount of hours");
        int hours = rate.nextInt();
        double hourRate = salary / (hours * 52);
        System.out.println("your hourly rate is " + hourRate + "USD");
    }
}
