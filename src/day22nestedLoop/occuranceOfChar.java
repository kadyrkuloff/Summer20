package day22nestedLoop;

public class occuranceOfChar {
    public static void main(String[] args) {
        String str = "abaabaca";
        char ch = 'd';
        int count = 0;
        /*for (int i= 0; i <= str.length() - 1; i ++){
            char each = str.charAt(i); //a b a b c
            if (each == ch){
                count +=1;
            }

        }*/
        int index = 0;
        while (index<= str.length()-1){
            char each = str.charAt(index);
            if (each == ch){
                count +=1;
            }
        }
        System.out.println(count);








    }
}
