package day13_Scanner;
import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your annual salary: ");
        int salary = num.nextInt();
        System.out.println("Enter your state tax rate: ");
        double stateTax = num.nextDouble();
        System.out.println("Enter you federal tax rate: ");
        double fedTax = num.nextDouble();

        double sTax = salary * stateTax;
        double fTax = salary*fedTax;
        double afterTax = salary  - sTax  - fTax ;
        System.out.println("your salary $ " + salary);
        System.out.println("your state tax rate $ " + sTax);
        System.out.println("your state tax rate $ " + fTax);
        System.out.println("your salary after taxes is $ "+afterTax);






    }
}
