package day10;

public class gradeCalc {
/*    grade:
    90 ~ 100 ==> A
    80 ~ 89 ==> B
    70 ~ 79 ==> C
    60 ~ 69 ==> D
    otherwise ==> F

 */
    public static void main(String[] args) {
        int grade = 95;
        String score ="";
        if (grade >= 90 && grade <= 100){
            score = "A";
        }else if (grade >= 80 && grade < 90){
            score = "B";
        }else if (grade >= 70 && grade < 80){
            score = "C";
        }else if (grade >= 60 && grade < 70){
            score = "D";
        }else{
            score = "F";
        }
        System.out.println(score);

    }

}

