package day08;

public class practice02 {
    public static void main(String[] args) {
        String fullName = "Vasya Vasya";
        int age = 52;
        String cit1 = "Russia";
        String cit2 = "France";
        boolean eligAge = age >= 18;
        boolean usCit = cit1 == "USA" || cit2 == "USA";
        boolean eligToVote = eligAge && usCit;
        if (eligToVote == true) {
            System.out.println(fullName + " is eligable to vote for Trump: " + "yes");
        }else{
            System.out.println(fullName + " is eligable to vote for Trump: " + "nah");
        }
        System.out.println(fullName + " is eligable to vote for Trump: " +eligToVote);
    }
}
