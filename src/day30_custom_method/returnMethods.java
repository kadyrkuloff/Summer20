package day30_custom_method;

public class returnMethods {
    public static void main(String args []){
    addition01(3,4);
    int sum = addition02(10,20);
        System.out.println(sum);
    }


    public static void addition01(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }


    public static int addition02(int a, int b){
        int sum = a+b;
        return sum;
    }











}
