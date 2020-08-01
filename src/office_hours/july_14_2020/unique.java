package office_hours.july_14_2020;

public class unique {
    public static void main(String[] args) {
        String str = "ABABC";
        String expectedResult = "";



        for(int j=0; j <= str.length()-1; j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch1 = str.charAt(i);
                if (ch == ch1) {
                    count++;
                }
            }

            if (count == 1) {
                expectedResult += ch;
            }

            System.out.println(expectedResult);

        }


    }
}
