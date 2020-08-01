package day29CustomMethods;

import day12_Scanner_switch.Switch;

public class Eligibility {

    public static void main(String[] args) {
        vote("Ertur", 32, true, "Slippy Joe" );
        eligibleToBuyAlcohol(true,20);
        calculator(2,'%',2);

    }

    public static void vote(String name, int age, boolean citizen, String candidateName ){
        boolean eligibleToVote = age>17 && citizen==true;
        if(eligibleToVote){
            System.out.println(name+" is eligible to vote for "+candidateName);
        }else{
            System.out.println(name+" is not eligible to vote");
        }
    }

    public static void eligibleToBuyAlcohol(boolean hasID, int age){
        if(hasID && age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("you are eligible to buy milk");
        }

    }
    public static void calculator(double num1, char operator ,double num2){

        switch(operator){
            case '+':
                System.out.println("Addition: "+ (num1+num2));
                break;
            case '-':
                System.out.println("Substraction: "+ (num1-num2));
                break;
            case '*':
                System.out.println("Multiplication: "+ (num1*num2));
                break;
            case '/':
                System.out.println("Division: "+ (num1/num2));
                break;
            case '%':
                System.out.println("Modulo: "+ (num1%num2));
                break;
            default:
                System.out.println("Ivalid Entry");
        }

    }


















}
