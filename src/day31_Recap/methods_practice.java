package day31_Recap;

public class methods_practice {

    public static void main(String[] args) {
        int jopa= max2(5,6);
        System.out.println(jopa);
    }

    public static void max(int a, int b){

        int max = (a > b)? a : b;
        System.out.println(max);
    }

    public static int max2(int a, int b){
        return (a > b)? a : b;
    }















}
