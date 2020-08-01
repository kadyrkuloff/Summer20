package day08;

public class practice {
    public static void main(String[] args) {
        //
        String firstName = "Ertur";
        String lastName = "Meder";
        String fullName = firstName +" "+ lastName;
        int age = 32;
        String citizenUsa = "USA";
        boolean eligToVote = age >= 18 && citizenUsa == "USA";
        System.out.println(fullName + " is eligible to vote: " + eligToVote);
    }


}
