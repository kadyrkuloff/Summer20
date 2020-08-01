package day11Ternary;

public class daysInMonth {
    public static void main(String[] args) {
        int mon = 0;
        boolean day28 = mon == 2;
        boolean day30 = mon == 4 || mon == 6 || mon == 9 || mon == 11;
        boolean invalid = mon < 1 || mon > 12;
        String month = "";
        if (day28){
            month = "This month has 28 days";
        }else if (day30){
            month = "This month has 30 days";
        } else if (invalid) {
            month = "invalid";
        }else{
            month = "This month has 31 days";
        }
        System.out.println(month);
        }













    }






