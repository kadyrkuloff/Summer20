package day14_recap;

import java.util.Scanner;
/*
 1. write a program for the shipping info that, the program should ask:
                    building number ( nextInt() )
                            nextLine()
                    Street address (Assume it has more than one word) ( nextLine() )
                    city name (nextLine() )
                    state name ( next() )
                    zip code ( nextInt() )
                            nextLine()
                    full name of the person ( nextLine() )
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102
 */
public class address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter building number");
        int buildingNumber = input.nextInt();
        input.nextLine();
        System.out.println("Enter your street name:");
        String address = input.nextLine();
        System.out.println("Enter your city:");
        String city = input.nextLine();
        System.out.println("please enter your state:");
        String state = input.next();
        System.out.println("please enter your zip code:");
        int zip = input.nextInt();
        input.nextLine();
        System.out.println("Please enter your full name:");
        String fullName = input.nextLine();
        System.out.println("Ship to: " + fullName + "\n\t at " + buildingNumber + " " + address +",\n\t "+ city +", "+ state+ " "+ zip);
    }
}
