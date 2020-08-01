package day12_Scanner_switch;

public class Switch {
    public static void main(String[] args) {
        int day = 5;
        String result = " ";
        switch (day){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "invalid";
                break;





        }
        System.out.println(result);
    }
}
