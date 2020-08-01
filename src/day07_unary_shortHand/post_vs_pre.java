package day07_unary_shortHand;

public class post_vs_pre {
    public static void main(String[] args) {
        int a = 10;
        System.out.println( ++ a);
        System.out.println(a);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%" );
        int b = 10;
        System.out.println(b++);
        System.out.println(b);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        int c = 25;
        int d = c++;
        System.out.println(c);
        System.out.println(d);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        int e = 25;
        e++;
        System.out.println(e);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        int x = 8;
        int y = x--;
        System.out.println(x);
        System.out.println(y);

        System.out.println("просакпросакпросакпросакпросакпросакпросакпросакпросакпросак");
        int a7 = 1;
        a = -a7-- + a7++ / -a7-- * --a7;
        System.out.println(a7);
        System.out.println("просакпросакпросакпросакпросакпросакпросакпросакпросакпросак");
        int a8 = 50;
        a8 = --a8 + a8++ + a8-- + a8++;
        System.out.println(a8);
        System.out.println("просакпросакпросакпросакпросакпросакпросакпросакпросакпросак");
        int xy = 4;
        int yxy = xy * 4 - xy++;
        // yxy = 4 * 4 - 4 does not change because operator is post equals 12
        System.out.println(yxy);
        System.out.println(xy);
    }

}
