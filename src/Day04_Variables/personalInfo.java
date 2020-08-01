package Day04_Variables;

import java.sql.SQLOutput;

public class personalInfo {
    public static void main(String[] args) {
        //ssn, first name, last name, gender, age, country, is employeed

        String mySSN = "*******13666";
        String myFirstName = "Vasya";
        String myLastName = "Ivanov";
        char myGender = 'M';
        int myAge = 32;
        String myOrgCountry = "Kyrgyzstan";
        boolean isEmployeed = true;
        System.out.println("My name is " + myFirstName);
        System.out.println("My family name is " + myLastName);
        System.out.println("My gender is " + myGender);
        System.out.println("My Fatherland is " + myOrgCountry);
        System.out.println("I am " + myAge + " years old");
        System.out.println("Employment status " + isEmployeed);
        System.out.println("My ssn is " + mySSN);
    }
}
