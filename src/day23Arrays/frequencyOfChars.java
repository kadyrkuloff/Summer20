package day23Arrays;

public class frequencyOfChars {
    /*
     3. write a prgram that can return the frequency of every single characters from the string:
            ex:
                str1 = "aabbccaa";
                output: a4b2c2
                HINT:
                    easier approach:
                            1. remove duplicates ==> str2 = "abc"
                            2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
                            3. result: a4b2c2
                        previous section we leaned how to find the frequency of one character.
                        you will need to repeat the same steps
     */
    public static void main(String[] args) {
        String str = "ABABAB";//result expected "A2B2"
        String nonDup = "";
        String result = "";
        for(int i = 0; i <= str.length()-1; i++){//removing dub from str
            String ch = "" + str.charAt(i);//A B A B
            if(!nonDup.contains(ch)){
                nonDup += ch;
            }


        }
        System.out.println(nonDup);// conting how many ch
        for (int j = 0; j <= nonDup.length()-1; j++) {
            char ch = nonDup.charAt(j);//A
            int count = 0;//2
            for (int k = 0; k <= str.length() - 1; k++) {
                if (str.charAt(k) == ch) {
                    count += 1;
                }
            }
            result += "" + ch + count;

        }


        System.out.println(result);






    }
}
