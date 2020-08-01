package day20WhileLoop;

import java.util.Scanner;

public class whilepractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pass = "Cybertek123";
        System.out.println("enter your password");
        String input = in.nextLine();

        while(!input.equals(pass)){
            System.out.println("please re-enter your password");
            input = in.nextLine();

        }




    }
}
