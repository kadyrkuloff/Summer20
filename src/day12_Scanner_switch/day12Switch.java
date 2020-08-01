package day12_Scanner_switch;

public class day12Switch {
    public static void main(String[] args) {
        int n1 = 33;
        int n2 = 44;
        int n3 = 60;
        /*
        String result = (n1 > n2 && n1 > n3)? "n1 is bigger" : (n2 > n3 && n2 > n1)? "n2 is bigger": "n3 is bigger";
        System.out.println(result);
        boolean n1IsBigger = n1 > n2 && n1 > n3;
        boolean n2IsBigger = n1IsBigger == false && n2 > n3;
        String answer = "";
        if (n1IsBigger ){
            answer = "n1 is bigger";
        }else if (n2IsBigger){
            answer = "n2 is bigger";
        }else{
            answer = "n3 is bigger";
        }
        System.out.println(answer);

         */
        String result = (n1 > n2 && n1 > n3)? "n1 is bigger" : (n2 > n1 && n2 > n3)? "n2 is bigger" : "n3 is bigger";
        System.out.println(result);



    }
}
