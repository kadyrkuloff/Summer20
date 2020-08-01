package day23Arrays;

import java.util.Scanner;

public class cybertekInn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Cybertek Inn");

        int total = 0;
       while (true) {
           System.out.println("please choose from following: ");
           System.out.println("1. King Bed: $120");
           System.out.println("2. Queen Bed: $100");
           System.out.println("3. Single Bed: $80");

           int option = in.nextInt();

           switch (option) {
               case 1:
                   total += 120;
                   break;
               case 2:
                   total += 100;
                   break;
               case 3:
                   total += 80;
                   break;

           }
           System.out.println("do you want to reserve another room");
           String a = in.next().toLowerCase();

           while(!(a.equals("yes")||a.equals("no"))){
               System.out.println("invalid, please re-enter");
               System.out.println("do you want to reserve another room");
               a = in.next().toLowerCase();
           }

           if(a.equals("no")){
               break;
           }
       }
        System.out.println("your total is: $"+total);
    }
}
