package office_hours.july_14_2020;

public class unique_words {
    public static void main(String[] args) {
        String[] words = {"C#", "C#", "Python", "Python", "Java", };
        for(String a:words) {
            String s = a;
            int count = 0;
            for (String each : words) {
                if (each == s) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(s);
            }
        }












    }
}
