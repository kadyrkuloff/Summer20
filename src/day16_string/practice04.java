package day16_string;

public class practice04 {
    public static void main(String[] args) {
        String email = "cybertek@gmail.com";
        email = email.replace("gmail", "yahoo");
        System.out.println(email);
        String word = "java";
        word = word.replace("a", "e");
        System.out.println(word);
        String sent = "I like to learn Java, Java is cool, Java is fun";
        sent = sent.replace("a, Java", "a, C#");
        sent = sent.replace("Java ", "Python ");
        System.out.println(sent);
        String ggg = "I like to stay in Cybertek, Cybertek is nice place";
        ggg = ggg.replace("Cybertek", "MIT");
        System.out.println(ggg);
        ggg = ggg.replace("MIT", "Cybertek");
        System.out.println(ggg);
        String pu = "I like to leaRn Java, we aRe enjoy Java";
        pu = pu.replace('R', 'r');
        System.out.println(pu);






    }
}
