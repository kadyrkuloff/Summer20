package day08;

public class ifStatmentPrac04 {
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 80;
        double result =(num1 + num2) * 25; // 2500
        double remainder = result % 40;
        boolean r = remainder <= 20;
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        int age = 20;
        if (age >= 21){
            System.out.println("how can I help you?");
        }else{
            System.out.println("you have to leave or I call cops");
        }
        System.out.println("mwmwmwmwmwmwmwmmwmwmwmwmmmwmwmwmwmwmwmwmmmwmwmwmw");
        int a = 200;
        int b = 200;
        if (a>b){
            System.out.println(a + " is the larger number");
        }
        if (b>a){
            System.out.println(b + " is the larger number");
        }
        if (a==b){
            System.out.println(a + " equals " + b);

        }
        System.out.println("mwmwmwmwmwmwmwmmwmwmwmwmmmwmwmwmwmwmwmwmmmwmwmwmw");

        boolean breakTime = false;
        if (breakTime){
            System.out.println("take 15 min breather");
        }
        if (!breakTime){
            System.out.println("keep studing");
        }

        System.out.println("mwmwmwmwmwmwmwmmwmwmwmwmmmwmwmwmwmwmwmwmmmwmwmwmw");
        boolean Corona = false;
        if (Corona){
            System.out.println("Buy more toilet paper");
            System.out.println("Buy more sanitizers");
            System.out.println("Social Distance");
        }
        if (!Corona){
            System.out.println("lucky one");
        }
        System.out.println("mwmwmwmwmwmwmwmmwmwmwmwmmmwmwmwmwmwmwmwmmmwmwmwmw");
        // tri
        int ang1 = 44;
        int ang2 = 46;
        int ang3 = 90;
        boolean valid = ang1 + ang2 + ang3 == 180;
        boolean invalid = !valid;
        if (valid){
            System.out.println("valid triangle");
        }
        if (invalid){
            System.out.println("trangle error");
        }
        System.out.println("mwmwmwmwmwmwmwmmwmwmwmwmmmwmwmwmwmwmwmwmmmwmwmwmw");
        int numb = 22222221;
        boolean even = numb % 2 == 0;
        boolean odd = !even;
        if (even){
            System.out.println("this - " + numb + " is even number");
        }
        if (odd){
            System.out.println("this - "+ numb + " is odd number");
        }





    }
}
