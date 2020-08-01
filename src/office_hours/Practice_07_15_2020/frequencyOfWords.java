package office_hours.Practice_07_15_2020;

public class frequencyOfWords {
    public static void main(String[] args) {
        String str = "catcat";
        int count = 0;
        while(str.contains("cat")){
            count++;
            str = str.replaceFirst("cat", "");
        }
        System.out.println(count);












    }
}
