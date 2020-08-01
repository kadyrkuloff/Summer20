package day09If;

public class max {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;
        boolean aMax = a > b && a > c;
        boolean bMax = b > c && b > a;
        boolean cMax = c > b && a < c;
        double max = 0;
        if (aMax){
            max = a;
        }
        if (bMax){
            max= b;
        }
        if (cMax){
            max = c;
        }
        System.out.println(max + " max number");
    }
}
