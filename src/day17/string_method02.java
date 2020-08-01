package day17;

public class string_method02 {
    public static void main(String[] args) {
        /*
        String methods: equals, equalsIgnorecase, isEmpty, ends, starts, contains
         */
        String s1 = "Cat"; //string pool
        String s2 = new String("Cat"); // heap
        String s3 = new String("Cat");// heap
        System.out.println(s1 == s2);// false
        System.out.println(s1.equals(s2));//true
        System.out.println(s2 == s3);//false
        System.out.println(s2.equals(s3));//true

        //
        String s4 = "java";
        String s5 = "Java";
        System.out.println(s4.equals(s5)); // false
        System.out.println(s4 == s5); // false
        System.out.println(s4.equalsIgnoreCase(s5));//true
        String s6 = "Ertur";
        String s7 = "eRtUr";
        System.out.println(s6.equalsIgnoreCase(s7));//true
        System.out.println(s6.equals(s7));//false

        // isEmpty: checks if the length of string is 0
        String str = " ";
        System.out.println(str.isEmpty());//false
        str = str.trim();//""
        System.out.println(str.isEmpty());//true

        //contains: checks included or not
        String str3 = "Java, C#, Python, Ruby, C++";
        System.out.println(str3.contains("Java"));//true
        System.out.println(str3.contains("java"));// false case sensitive
        System.out.println(str3.toLowerCase().contains("java"));//true
        String str4 = "ABCD";
        System.out.println(str4.contains("D"));//true

        //startsWith & endsWith
        String str5 = "Cybertek";
        System.out.println(str5.startsWith("CybABC")); //false
        System.out.println(str5.startsWith("Cyber"));//true
        String str6 = "Corona";
        System.out.println(str6.endsWith("Virus"));//false
        String str7 = "Today is a great day";
        System.out.println(str7.endsWith("day"));//true



    }
}
