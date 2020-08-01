package day23Arrays;

import java.util.Scanner;

public class calcultor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("enter two numbers");
            double num1 = in.nextDouble();
            double num2 = in.nextDouble();
            System.out.println("enter math operator");
            char operator = in.next().charAt(0);

            //double result = (operator == '+')? num1 + num2 : (operator == '-')? num1 - num2 : (operator == '*')? num1 * num2: (operator == '/')? num1/num2: (operator == '%')? num1%num2: 0;
            switch (operator){
                case '+':
                    System.out.println(num1+num2);
                    break;
                case '-':
                    System.out.println(num1-num2);
                    break;
                case '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                case '%':
                    System.out.println(num1%num2);
                    break;
                default:
                    System.out.println("invalid operator");
            }


           // System.out.println(result);
            System.out.println("do you want to continue");
            String answer = in.next();//.toLowerCase alternative for .equalsIgnoreCase()

            while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){//while the answer invalid
                System.out.println("invalid answer, please enter yes or no");
                System.out.println("do you want to continue?");
                answer=in.next().toLowerCase();
            }

            if (answer.equalsIgnoreCase("no")){
                break;
            }
        }

    }
}
