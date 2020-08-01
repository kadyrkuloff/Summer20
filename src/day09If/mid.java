package day09If;

public class mid {
    public static void main(String[] args) {
        double a = 1000;
        double b = 2000;
        double c = 3000;
        boolean aMid = (a > b && a < c) || (a > c && a < b) ;
        boolean bMid =(b>c && b<a) || (b<c && b>a);
        boolean cMid = !aMid && !bMid;
        double mid = 0;
        if (aMid){
            mid = a;
        }
        if (bMid){
            mid = b;
        }
        if (cMid){
            mid = c;
        }
        System.out.println(mid + " is medium number");
    }
}
