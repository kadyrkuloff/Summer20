package day32MethodOverloading;

import java.util.Scanner;

public class formatFullName {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String first = in.next();
        String last = in.next();

        first = first.toUpperCase().substring(0,1)+first.toLowerCase().substring(1);
        last = last.toUpperCase().substring(0,1)+last.toLowerCase().substring(1);
        String fullName = first + " " + last;
        System.out.println(fullName);











    }
}
