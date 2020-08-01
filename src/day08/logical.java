package day08;

public class logical {
    public static void main(String[] args) {
        //!: opposite boolean
        boolean r1 = 9 > 7; // true
        boolean r2 = !r1; // false
        System.out.println(r1 + " : " + r2);
        System.out.println(!false);
        System.out.println(!true);
        boolean r3 = !false == true;
        // true == true ==> true
        System.out.println(r3);
        boolean r4 = true == !true;
        System.out.println(r4);
        System.out.println("||||||||||||||||||||||||||||");
        //&&
        boolean r5 = 9 > 5 && 9 > 10;
        //          true (and)&& false => false
        System.out.println(r5);
        boolean r6 = 9 > 11 && 9 > 13;
        //           false && false => false
        System.out.println(r6);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        boolean r7 = 9 > 8 || 9 > 10;
        //           true  || false
        boolean r8 = 9 > 11 && 9 > 13;
        //           false || false
        System.out.println(r7);
        System.out.println(r8);
    }
}
