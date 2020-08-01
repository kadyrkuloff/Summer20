package day07_unary_shortHand;

public class positive_negative_0 {
    public static void main(String[] args) {
        int num1 = 120;
        boolean posOrNah = num1 > 0;
        boolean negOrNah = num1 < 0;
        boolean zeroOrnah = num1 == 0;
        System.out.println("Is "+num1+" Positive - " + posOrNah);
        System.out.println("Is "+num1+" Negative - " + negOrNah);
        System.out.println("Is "+num1+" equals to zero - " + zeroOrnah);
        System.out.println("5 + 2" +(3 +4));
        long a = 30;
        long b =(short)a;
        System.out.println(b);
        float a1 = 100.987_6543f;
        short b2 = (byte)a1;
        byte c1 = (byte) b2;
        System.out.println(c1);
        int a3 = 3; int b4 = 2;
        long c3 = (a3 + b4)*2/3%2;
        System.out.println(c3);
        long a5 = 3000L;
        double b5 = (float)a5;
        int c5 = (short)b5;
        System.out.println((int)(10.0/3));


    }
}
