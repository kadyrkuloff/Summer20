package day09If;

public class Vote {
    public static void main(String[] args) {
        int age = 18;
        boolean usCiti = true;
        if (age >= 18 && usCiti){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }
}
