package day11Ternary;

public class ternary03 {
    public static void main(String[] args) {
        int num = 00;
        String result = (num > 0) ? "positive" : (num < 0) ? "negative" : "zero";
        System.out.println(result);
        int a = 200;
        int b = 200;
        String res = (a > b)? a + " is bigger" : (b > a)? b + " is bigger" : a + " and " + b + " are equal";
        System.out.println(res);







    }
}
