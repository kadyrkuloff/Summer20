package day16_string;

public class practice06_index {
    public static void main(String[] args) {
        String str = "Cybertek";
        int strInt = str.indexOf("C");
        System.out.println(strInt);

        String a = "I like to stay in cybertek, we are learning java";
        int r1 = a.indexOf("r");
        System.out.println(r1);
        System.out.println(a.charAt(r1));
        int r2 = a.indexOf("re");//count(returns) only first char in()
        System.out.println(r2);
        int r3 = a.indexOf("rn");
        System.out.println(r3);

        //lastIndexOf();
        String b = "Java is a programming language, and Java is fun";
        int i = b.lastIndexOf("J");
        System.out.println(i);


    }

}
