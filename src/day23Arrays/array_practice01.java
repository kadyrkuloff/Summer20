package day23Arrays;

public class array_practice01 {
    public static void main(String[] args) {
        String[] students = {"Cybertek", "Muhtar", "Nadir", "Asiya", "Saim"};
        //                      0,          1,         2,       3,      4
               String name1 = students[4];
        System.out.println(name1);

        System.out.println("+++++++++++++");

        String[] names ={"Mike", "Adam", "Tony", "John", "Amy"};
        int[] scores = {85,70,95,90,100};
       // System.out.println(names[0] +"'s score is " +scores[0]);
       // System.out.println(names[1] +"'s score is " +scores[1]);
        for (int i = 0; i <=4; i++){
            System.out.println(names[i]+"'s score is " +scores[i]);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        String[] classMates = new String[5];
        classMates[0] = "Fatih";
        classMates[2] ="Hazel";
        classMates[1] = "Viorel";
        classMates[3] = "Elkem";
        classMates[4] = "Ahmed";
        for (int j = 0; j <= classMates.length - 1; j++){
            System.out.println(classMates[j]);
        }


    }
}
