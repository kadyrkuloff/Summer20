package day32MethodOverloading;

public class methodOverloading02 {
    public static void main(String[] args) {

        double resultOf2 = addition2Numbers(4,4);
        double resultOf3 = addition3Numbers(3,2,3);
        double resultOf4 = addition4Numbers(3,2,3,0);
        System.out.println(resultOf2 +" "+ resultOf3+" "+resultOf4);
        System.out.println("====================================");
        double resultOf202 = addition(4,3);
        double resultOf302 = addition(4,1,2);
        double resultOf402 = addition(4,1,1,1);
        System.out.println(resultOf202 +" "+ resultOf302+" "+resultOf402);

    }

    public static double addition2Numbers(double num1, double num2){
        double result = num1+ num2;
        return result;
    }

    public static double addition3Numbers(double num1, double num2, double num3){
        double result = num1+ num2+num3;
        return result;
    }

    public static double addition4Numbers(double num1, double num2, double num3, double num4){
        double result = num1+ num2+num3+num4;
        return result;
    }

    //===========================================================================================


    public static double addition(double a, double b){
        double result = a+b;
        return result;
    }

    public static double addition(double a, double b, double c){
        double result = a+b+c;
        return result;
    }

    public static double addition(double a, double b, double c, double d){
        double result = a+b+c+d;
        return result;
    }






}
