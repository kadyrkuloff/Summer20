package day32MethodOverloading;

import java.util.Scanner;

public class calculator {

    public static double calculator(double num1, char oper ,double num2){
        double result = (oper == '+')? num1 + num2:(oper == '-')? num1 - num2:(oper == '*')? num1 * num2:(oper == '/')? num1 / num2:(oper == '%')? num1 % num2:0;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number");
        double firstNum = in.nextDouble();
        System.out.println("enter operator");
        char operator = in.next().charAt(0);
        System.out.println("enter second number");
        double secondNum = in.nextDouble();
        double result = calculator(firstNum,operator,secondNum);
        System.out.println(result);
    }
}
