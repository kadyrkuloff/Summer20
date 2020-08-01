package office_hours.practice_07_13_2020;

public class frequencyOfChar {
    public static void main(String[] args) {
        String str = "AAABBBBCCCCCDDDDDDDDEEEEEEEFFFFFFFFFFF";//O2P1Q2
        String nonDup = "";// O P D
        for(int i = 0; i<=str.length()-1; i++){
            String ch = ""+str.charAt(i);// O O P Q Q
            if (!(nonDup.contains(ch))){
                nonDup += ""+ ch;
            }
        }

        for(int j = 0; j < nonDup.length(); j++){
            char abc = nonDup.charAt(j);
            int count = 0;
            for (int i = 0; i <= str.length()-1; i++ ){
                char each = str.charAt(i);
                if(each ==abc) {
                    count++;
                }
            }
            String result = ""+ abc +count;
            System.out.print(result);
        }















    }
}
