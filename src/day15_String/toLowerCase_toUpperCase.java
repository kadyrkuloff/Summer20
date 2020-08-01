package day15_String;

import java.util.Scanner;

public class toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String name1 = "CYBERTEK SCHOOL";
        String loweCaseName = name1.toLowerCase();
        System.out.println(loweCaseName);
        String upper = loweCaseName.toUpperCase();
        System.out.println(upper);
        String a = "this text written in lower case for now but after manipulations it will be changed.";
        String b = a.toUpperCase();
        System.out.println(b);

       /* Scanner in = new Scanner(System.in);
        System.out.println("please enter your 1st string");
        String fString = in.nextLine();

        System.out.println("please enter your 2nd string");
        String sString = in.nextLine();
        int dr = fString.length();
        int br = sString.length();
        if (dr>br){
            System.out.println(fString + dr);
        }else {
            System.out.println(sString + br);
        }*/
        String i = "         f   u            ";
        i = i.trim();
        System.out.println(i);





    }
}
