package day13_Scanner;

public class browser {
    public static void main(String[] args) {
        String browserName = "opera";
        switch (browserName){
            case "chrome":
                System.out.println("opening Chrome browser");
                break;
            case "firefox":
                System.out.println("opening Firefox browser");
                break;
            case "opera":
                System.out.println("opening Opera browser");
                break;
            case "safari":
                System.out.println("opening Safari browser");
                break;
            case "edge":
                System.out.println("opening Edge browser");
                break;
            default:
                System.out.println("Invalid Browser Name");

        }
    }
}
