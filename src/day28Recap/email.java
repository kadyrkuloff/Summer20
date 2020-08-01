package day28Recap;

import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        /*
        write a program that can get the name and domain of any given email address
        Ex:
            cybertek@gmail.com
            output:
                name: cybertek
                domain: gmail
         */
        Scanner in = new Scanner(System.in);

        String email = in.next();
        String name = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));

        System.out.println(name);
        System.out.println(domain);










    }
}
