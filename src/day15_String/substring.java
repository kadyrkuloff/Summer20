package day15_String;

public class substring {
    public static void main(String[] args) {
        String s = "Java is fun";
                  //012345678910
        String word = s.substring(0, 4);// from 0 up to 4 (start index, end index + 1)
        System.out.println(word);
        String word2 = s.substring(8, 11);
        System.out.println(word2);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
        String s2 = "I like Movies and TV Series";
        String movies = s2.substring(7, 13);
        System.out.println(movies);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
        String name = "KAdYrKuL";
        String fChar = name.substring(0, 1);
        String restChar = name.substring(1, name.length());
        char t = name.charAt(0);
        String u = restChar.toLowerCase();
        String r = t + u;
        System.out.println(name);
        System.out.println(restChar);
        System.out.println(r);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
        String n = "Kadyrkul";
        String o = n.substring(1);
        String p = n.charAt(0) + o.toUpperCase();
        System.out.println(p);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
        String ln = "KadYrKUlOv";
        String fC = ln.substring(0,1);
        String rC = ln.substring(1);
        ln = fC.toUpperCase() + rC.toLowerCase();
        System.out.println(ln);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
        String fS = "I like Breaking Bad";
        String ser = fS.substring(7);
        System.out.println(ser);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
        String sent = "I like Java Programming Language";
        String language = sent.substring(7);
        System.out.println(language);


    }



}
