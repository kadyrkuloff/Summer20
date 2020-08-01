package day15_String;
//import java.lang.String; imported automatically
//import java.util.Scanner;

public class String_intro {
    public static void main(String[] args) {
        String str = "Cybertek";
        //Scanner in = new Scanner(System.in);
        String name = "Ertur";
        String lastName = "Meder";
        String gender = new String("Male");
        String nationality = new String("Kyrgyz");
        String s1 = "cat";
        String s2 = "cat";
        System.out.println(s1 == s2);
        String d1 = "Dog";//String literal
        String d2 = "Dog";//String literal
        System.out.println(d1 == d2);//true
        String t1 = new String ("Tiger");
        String t2 = new String ("Tiger");
        System.out.println(t1 == t2);
        String c1 = "Cybertek";
        String c2 = new String("Cybertek");
        String c3 = new String("Cybertek");
        String c4 = "Cybertek";
        String c5 = "cybertek";
        System.out.println(c1 == c2);//false => stored in different locations
        System.out.println(c2 == c3);// false ==> stored in different location
        System.out.println(c1 == c4);// true both saved in String pool
        System.out.println(c4 == c5);// false ==> two different var (case sensitive language)
    }
}
