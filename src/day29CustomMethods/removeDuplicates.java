package day29CustomMethods;

public class removeDuplicates {

    public static void main(String[] args) {
        removeDup("AABCCD");
    }

    public static void removeDup(String str){
        String nonDup = "";
        for (String each : str.split("") ){
            if(!nonDup.contains(each)){
                nonDup+=each;
            }
        }
        System.out.println(nonDup);
    }














}
