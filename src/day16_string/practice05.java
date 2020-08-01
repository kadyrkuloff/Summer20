package day16_string;

public class practice05 {
    public static void main(String[] args) {
        String str = "I like to drink tea and tea";
        str = str.replaceFirst("tea", "pepsi");
        System.out.println(str);
        String s = "I like to watch Game of Thrones, and walking death";
        s= s.replace(", and walking death", "");
        System.out.println(s+".");

    }
}
