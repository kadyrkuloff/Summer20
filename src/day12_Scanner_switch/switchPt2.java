package day12_Scanner_switch;

public class switchPt2 {
    public static void main(String[] args) {
        String productName = "iPhone";
        switch (productName){
            case "galaxy":
                System.out.println("Samsung");
                break;
            case "iPhone":
            case "iPad":
            case "MacBook":
                System.out.println("Apple");
                break;





        }
    }
}
