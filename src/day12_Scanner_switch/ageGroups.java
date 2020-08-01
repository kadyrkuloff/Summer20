package day12_Scanner_switch;

public class ageGroups {
    public static void main(String[] args) {
        int age =73;
        String result = "";
        if (age > 0 && age <= 150) {
            /*if(age < 21){
                result = "Teenager";
            }else if (age >= 21 && age <= 55){
                result = "Adult";
            }else{
                result = "Senior";
            }
        }else{
            result = "Invalid entry";
        }*/
            result = (age < 21) ? "Teenager" : (age <= 55) ? "Adult" : "Senior";
        }else{
            result = "invalid entry";
        }
        System.out.println(result);
    }
}
