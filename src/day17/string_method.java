package day17;

public class string_method {
    public static void main(String[] args) {
       String str = "Cybertek";
       //            01234567
        char ch1 = str.charAt(7);
        System.out.println(ch1);
        System.out.println("charAt()charAt()charAt()charAt()charAt()charAt()charAt()");
        String str2 = "Cybertek";
        str2 = str2 + " School";
        System.out.println(str2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        String str3 = "Cybertek";//length() return int/ last index: length() - 1
        int l = str3.length();
        System.out.println(l);
        System.out.println("length()length()length()length()length()length()length()");
        char ch2 = str3.charAt(l-1);//str3.length() - 1
        System.out.println(ch2);
        System.out.println("retrieve last char using charAt() and Length() methods");
        // upperCase & lowerCase
        String str4 = "cybertek";
        str4 = str4.toUpperCase();// "CYBERTEK" return new string in upper case
        System.out.println(str4);
        String str5 = "JAVA";
        str5 = str5.toLowerCase();
        System.out.println(str5);// "java" return new string in lower case
        System.out.println("toUpperCase & toLowerCasetoUpperCase & toLowerCase");
        // trim() going to remove unused spaces creates new string
        String str6 = "       Cybertek    School    ";//does not remove between words
        str6 = str6.trim();
        System.out.println(str6);
        System.out.println("trim()trim()trim()trim()trim()trim()trim()trim()trim()");
        //substring()
        String str7 = "I like Java Language";
                    // 012345678910
        String word = str7.substring(7,10+1); //last index excluded/beginning index included
        System.out.println(word);
        String word2 = str7.substring(12); // you can just give beginning index and it will take remainimg string till the end.
        System.out.println(word2);
        //indexOf & lastIndexOf ==> int (cant be double)
        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int i1 = str8.indexOf("W");
        System.out.println(i1);
        System.out.println(str8.charAt(i1));

        int i2 = str8.indexOf("We");// while only 1st char return index int.
        System.out.println(i2);
        String str9 = "Java Java Java";
        int i4 = str9.lastIndexOf("J");
        int i5 = str9.indexOf("J");
        int i6 = str9.indexOf(" Java ")+1;//gives index of first space by using +1 return J in second word.
        int i7 = str9.lastIndexOf("Java ");
        //replace & replaceFirst
        String s1 = "I like Java, Java is a pogramming language";
        s1 = s1.replace("Java","C#");//"......"
        System.out.println(s1);
        String s2 = "I like Java, Java is a pogramming language";
        s2 = s2.replaceFirst("Java", "C#");
        System.out.println(s2);
        String s3 = "I like Java, Java is a pogramming language";
        s3 = s3.replace("Java is", "C# is");//make it unique nneds to replace target and unique additions
        System.out.println(s3);


    }
}
