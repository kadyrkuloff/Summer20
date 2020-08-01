package day16_string;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
       /*write a program to ask the user enter two number and a math operator.
        ex:
            10
            20
            *
        output:
            200
            10
            2
            /
        output:
            5
    valid math operators are: *, / , +, -, %
    Nested If*/
        Scanner in = new Scanner(System.in);
        System.out.println("print first number");
        int a = in.nextInt();
        System.out.println("print second number");
        int b = in.nextInt();
        System.out.println("print operator");
        char c = in.next().charAt(0);
        boolean valid = c == '+' || c == '-' || c == '*' || c == '/' || c == '%';
        if (valid){
            switch (c) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println(a%b);


            }
        }else{
            System.out.println("Invalid operator.");
        }







    }
}
