package day12_Scanner_switch;

public class daysInMonth {
    public static void main(String[] args) {
        int month = 42;
        String days = "";
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = "31 days in this month";
                break;
            case 2:
                days = "28 days in this month";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = "30 days in this month";
                break;
            default:
                days = "Invalid Entry";
        }
        System.out.println(days);

    }
}
