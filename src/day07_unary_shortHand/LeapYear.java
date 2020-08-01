package day07_unary_shortHand;

public class LeapYear {
    public static void main(String[] args) {
        short year = 2020;
        boolean leapYear;
        leapYear = year % 4==0;
        System.out.println("Is " + year + " leap year - " +leapYear);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        int num1 = 3000;
        boolean divBy2 = num1 % 2 == 0;
        boolean divBy3 = num1 % 3 == 0;
        boolean divBy5 = num1 % 5 == 0;
        System.out.println(num1 + " is divisible by 2: " + divBy2);
        System.out.println(num1 + " is divisible by 3: " + divBy3);
        System.out.println(num1 + " is divisible by 5: " + divBy5);

    }
}
