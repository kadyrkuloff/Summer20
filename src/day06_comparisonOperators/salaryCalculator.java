package day06_comparisonOperators;

public class salaryCalculator {
    public static void main(String[] args) {
        double rate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate =0.22;
        int weeklyHours = 40;
        int weeksInYear = 48;
        double salary = rate * weeklyHours * weeksInYear;
        double tax = salary * (stateTaxRate + federalTaxRate);
        double incomeAfterTax = salary - tax;
        System.out.println("your salary is: "+salary+" USD");
        System.out.println("your total tax is: " + tax +" USD");
        System.out.println("your income after tax is: "+incomeAfterTax +" USD");




    }



}
