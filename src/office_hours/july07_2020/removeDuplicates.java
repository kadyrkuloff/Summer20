package office_hours.july07_2020;

public class removeDuplicates {
    public static void main(String[] args) {
        String str = "nalan";
        String result = "";
        for(int i = 0; i <=str.length() -1; i++ ){
            String s =""+str.charAt(i);
            if(!result.contains(s)) {
                result += s;
            }
        }
        System.out.println(result);
        int a = 0;














    }
}
