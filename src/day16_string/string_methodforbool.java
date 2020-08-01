package day16_string;

import java.sql.SQLOutput;

public class string_methodforbool {
    public static void main(String[] args) {
        //isEmpty(); checks if length of given string empty or not returns true/false
        String a = "cybertek";
        System.out.println(a.isEmpty());
        String b = "";
        System.out.println(b.isEmpty());

        String c = "Java"; // string pool
        String d = new String("Java"); // heap
        System.out.println(c + " : " + d);
        System.out.println(c == d);
        System.out.println(c.equals(d));// checks if string has same text with given string.

        String e = new String("Java");
        String f = new String("Java");
        System.out.println(e == f);// false because both in heap and created using key word "new"
        System.out.println(e.equals(f));// returns true .equals been called.

        String g ="Java";
        String h = "Java";
        System.out.println(g == h);//return true
        System.out.println(g.equals(h));//return true

        String i = "JAVA";
        String j = "java";
        System.out.println(i.equals(j));// return false .equals cannot ignore case sensitivity.

        //equalsIgnoreCase(): is not case sensitive.
        System.out.println(i.equalsIgnoreCase(j)); // return true can ignore case sensitivity;


    }
}
