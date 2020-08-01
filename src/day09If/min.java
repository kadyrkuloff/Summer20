package day09If;

public class min {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;
        boolean aMin = a < b && a < c;
        boolean bMin = aMin == false && b < c;
        boolean cMin = !aMin && !bMin;
        double min = 0;
        if (aMin){
            min = a;
        }
        if (bMin){
            min = b;
        }
        if (cMin){
            min = c;
        }
        System.out.println(min + " is min number.");


    }

}
