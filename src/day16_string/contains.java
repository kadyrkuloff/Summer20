package day16_string;

public class contains {
    public static void main(String[] args) {
        String a = "I like to learn java programming language";
        System.out.println(a.contains("python"));//false
        System.out.println(!a.contains("python"));//true
        System.out.println(a.contains("java"));//true
        System.out.println(a.contains("JaVa"));//false ==> case sensitive.
    }
}
