package day35_ArraysList;

public class sumOfDigits02 {
    public static void main(String[] args) {
        String str = "a1b2c3";
        int sum = 0;
       for(char each:str.toCharArray()){
           if(Character.isDigit(each)){
               sum += Integer.parseInt(""+each);
           }
       }

        System.out.println(sum);
    }
}
