package day03_sequences_Variables;

public class salaryCalculator {
    public static void main(String[] args) {
        int salary = 100000;
        double tax = 0.28;
        double salaryAfterTaxes = salary - (salary * tax);
        System.out.println(salaryAfterTaxes);
    }
}
