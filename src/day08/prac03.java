package day08;

public class prac03 {
    public static void main(String[] args) {
        int appleCount = 20;
        int orangeCount = 30;
        int pearsCount = 30;
        boolean comp =appleCount < orangeCount || orangeCount >= pearsCount;
        System.out.println(comp);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        String outsideWeather;
        int degree;
        outsideWeather = "shinny";
        degree = 70;
        boolean comp2 = (!(outsideWeather == "rainy" || degree == 70));
        System.out.println(comp2);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        int b = 2;
        boolean res = ++b == 2 || --b == 2 && --b == 2;
        /*            3 == 2    || 2 == 2 && 1 == 2
                        false   ||   true   &&   false
                                    true && false => false

         */
        System.out.println(res);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        int c = 5;
        boolean r2 = c++ == 6 || c-- == 5;
        /*      r2 = 5   == 6 || 6 == 5
                        false || false => false
         */
        System.out.println(r2);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        boolean x = true, z = true;
        int y = 20;
        x = (y!=10) || (z == false);
        System.out.println(x);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        boolean A = true;
        boolean B = !A;
        boolean C = A != B && A == !B && !A == B;
                // true != false && true == true && false == false
                //      true     &&      true    &&       true
        System.out.println(C);







    }
}
