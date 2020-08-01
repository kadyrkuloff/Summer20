package day11Ternary;

public class ternary_02 {
    public static void main(String[] args) {
        int age = 19;
        String passport = "USA";
        String result = "";
        if (age > 18 && passport == "USA"){
            result = "Eligible";
        }else{
            result = "Not Eligible";
        }
        System.out.println(result);
        String elig = (age > 18 && passport == "USA") ? "Yes, you can" : "No, you can not ";
        System.out.println(elig);
        System.out.println("jgoigoengoengeongeongeongeogneoig");
        int a = 100;
        int b = 200;
        String c = (a == b) ? "equal" : "not equal";
        System.out.println(c);
        System.out.println("jfnsjfnsjnfjnfwnijwnfnfenfeeefefienfenfenfieneneerfnefnejn");
        int n1 = -100;
        String r = (n1 > 0) ? "positive" : (n1 < 0) ? "negative" : "zero" ;
        System.out.println(r);










    }
}
