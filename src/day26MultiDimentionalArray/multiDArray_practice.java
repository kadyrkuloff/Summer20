package day26MultiDimentionalArray;

import java.util.Arrays;

public class multiDArray_practice {
    /*
    testers : {"Liliia", "Odina", "Cristina", "Elkem"}
    dev: {"Ahmet", "Erfan", "Roza", "Sarah"}
    sm: {"Nurmamet"}
    PO: {"Nadir"}
    BA: {"Alex"}
    scrumTeam: testers, developers, SM, PO, BA
     */
    public static void main(String[] args) {

    String[] testers = {"Liliia", "Odina", "Cristina", "Elkem"};
    String[] developers = {"Ahmet", "Erfan", "Roza", "Sarah"};
    String[] SM = {"Nurmamet"};
    String[] PO = {"Nadir"};
    String[] BA = {"Alex"};
    String[][] scrumTeam = {testers, developers, SM, PO, BA};
    scrumTeam[4][0] = "Adam";
    scrumTeam[1][2] = "Amina";
        System.out.println(Arrays.deepToString(scrumTeam));
    for(String[] each :scrumTeam){
        for(String name :each){
            System.out.println(name);
        }
        //System.out.println(Arrays.toString(each));
    }
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        int [] [] scores = {{10, 20, 30, 45}, {60, 55, 75, 105}, {93, 48, 125, 135}};
        for(int[] each: scores){
            for(int num: each){
                if(num%3==0 || num%5==0){
                    System.out.print(num +", ");
                }
            }
        }







    }
}
