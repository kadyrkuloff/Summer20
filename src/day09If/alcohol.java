package day09If;

public class alcohol {
    public static void main(String[] args) {
        boolean haveId = true;
        int age = 20;
        boolean eligToAlco = age >= 21 && haveId;
        String result = "";
        if (eligToAlco){
            result = "come and get it";
        }
        if (!eligToAlco){
            result = "get out of here";

        }
        System.out.println(result);
    }

}
