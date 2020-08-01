package day14_recap;
import java.util.Scanner;
public class nextLine_rest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("enter your full name");
        String fullName = in.nextLine();
        System.out.println("please enter company name:");
        String companyName = in.nextLine();
        System.out.println(fullName+ " is " +age + " years old" + " company of employment " + companyName);










    }
}
