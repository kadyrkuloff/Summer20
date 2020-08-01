package day22nestedLoop;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
        //user name : cyber
        //password: tek123 4 chances.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter user name");
        String u = in.next();
        System.out.println("Enter user password");
        String p = in.next();
        int attempt = 0;
        while (!(u.equals("cyber") && p.equals("tek123"))){
            if (attempt >= 2){
                break;
            }
            System.out.println("invalid user name or password, Please re-enter");
            System.out.println("Enter user name");
            u = in.next();
            System.out.println("Enter user password");
            p = in.next();
            attempt++;


        }



    }
}
