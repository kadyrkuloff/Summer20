package day23Arrays;

import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("enter two numbers");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int sum = num1 + num2;
            System.out.println(sum);
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
