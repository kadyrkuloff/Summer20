package day11Ternary;

public class ternary {
    public static void main(String[] args) {
        int a = 100;
        String result = "";
        if (a%2 == 0){
            result = "even";

        }else{
            result = "odd";
        }
        System.out.println(result);
        System.out.println("sfjslkfklngekngelkrngelrknglkerngklen");

        String result2 = (a%2 == 0) ? "Even" : "Odd" ;
        System.out.println(result2);
        System.out.println("kgdafgekmdkmbkmbtkbkbrk");

        int b = 100;
        int c = 200;
        int max1 = 0;
        if (b > c) {
            max1 = b;
        }else{
            max1 = c;
        }
        System.out.println(max1);
        int max2 = (b>c) ? b : c;
        System.out.println(max2);
        System.out.println("oihsfoijifoneqogfeougeugeogeogeoigjeogeogoeigoeijgiejioejgioejg");
        int age = 100;
        String passport = "USA";

        String eligToVote = (age >= 18 && passport == "USA") ? "yes, please fill up this form" : "leave";

        System.out.println(eligToVote);




    }
}
