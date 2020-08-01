package day11Ternary;

public class nestedIf {
    public static void main(String[] args) {
        int score = 58;
        String result = "";
        if (score >= 0 && score <= 100){
             if (score >= 90){
                result = "A";
             }else if (score >= 80){
                 result = "B";
             }else if (score >= 70){
                 result = "C";
             }else if (score >= 60){
                 result = "D";
             }else{
                 result = "F";
             }
        }else{
            result = "Invalid Score";
        }
        System.out.println(result);


        int salary = 3000;
        int workExp = 3;
        String resu = "";
        if (salary >= 30000){
            if(workExp > 2){
                resu = "you meet AC";
            }else{
                resu = " we would like more work expiriance ";
            }



        }else{
            resu = "you aint making enough";
        }
        System.out.println(resu);

        int day = 6;
        String nDay = "";
        if (day > 0 && day <=7){
            /*if(day == 1){
                nDay = "Monday";
            }else if(day == 2){
                nDay = "Tuesday";
            }else if(day == 3){
                nDay = "Wednesday";
            }else if(day == 4){
                nDay = "Thursday";
            }else if(day == 5){
                nDay = "Friday";
            }else if(day == 6){
                nDay = "Saturday";
            }else{
                nDay = "Sunday";
            }*/
            nDay = (day == 7)? "Sunday" : (day == 6) ? "Saturday" : (day == 5) ? "Friday" : (day == 4) ? "Thursday" : (day == 3) ? "Wednesday" : (day == 2) ? "Tuesday" : "Monday";

        }else{
            nDay = "invalid entry";
        }
        System.out.println(nDay);






















    }
}
