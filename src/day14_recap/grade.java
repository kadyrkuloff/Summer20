package day14_recap;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your score:");
        double score = in.nextDouble();
        in.close();
        String result = "";
        if (score >= 0 && score <= 100){
            if (score >= 90){
                result = "Excellent";

            }else if (score >=80 ){
                result = "Great";

            }else if (score >=70 ){
                result = "Good";

            }else if (score >=60 ){
                result = "Pass";

            }else{
                result = "Failed";

            }
        }else{
            result = "Invalid Entry";
        }
        System.out.println(result);






    }


}
