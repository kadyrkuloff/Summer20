package day29CustomMethods;

public class unique {
    public static void main(String[] args) {

        /*
        Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop
         */
        String [] arr = {"A", "B", "B", "C","D", "D", "E"};
        for(String i : arr) {

            int count = 0;
            for (String each : arr) {
                if (i.equalsIgnoreCase(each)) {
                    count++;
                }
            }
            if(count == 1){
                System.out.println(i);
            }
        }











    }
}
