package day15_String;

import java.util.Scanner;

public class practice03_concat {
    public static void main(String[] args) {
        String schoolName = "Cybertek";
        String updated = schoolName.concat(" School");// have to assigned to new ver. cause String = unmuttable
        System.out.println(updated);
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String name = in.next();
        System.out.println("Please enter your last name");
        String lastName = in.next();
        String fullName = name.concat(" " + lastName);
        System.out.println(fullName);
    }
}
