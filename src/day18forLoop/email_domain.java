package day18forLoop;

public class email_domain {
    public static void main(String[] args) {
        String email = "cybertek@gmail.com";
        int index1 = email.indexOf("@");
        int index2 = email.lastIndexOf(".");
        System.out.println(email.substring(index1 + 1, index2));
    }
}
