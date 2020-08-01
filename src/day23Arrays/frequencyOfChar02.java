package day23Arrays;

public class frequencyOfChar02 {
    public static void main(String[] args) {
        String str = "BBCCDDEEFF";
        String nonDup = "";
        for (int i = 0; i<= str.length()-1; i++ ){
            String ch = "" + str.charAt(i);//B B C C D D
            if(nonDup.contains(ch)){
                continue;
            }else{
                nonDup += ch;
            }
        }
        String expectedResult = "";//B2C2D2
        //str = "BBCCDD"    nonDup ="BCD" ===> "B2C2D2"

        for(int j=0; j<=nonDup.length()-1;j++){//iterates the string nonDup
            char ch1 = nonDup.charAt(j);//B C D
            int count1 = 0;
            for (int i =0; i <= str.length()-1; i++){//returns the frequenct of each ch from string str
                if (str.charAt(i) == ch1){
                    count1++;
                }
            }
            expectedResult += ""+ch1 + count1;
        }
        /*
        char ch1 = nonDup.charAt(0);//B
        int count1 = 0;
        for (int i =0; i <= str.length()-1; i++){
            if (str.charAt(i) == ch1){
                count1++;
            }
        }
        expectedResult += ""+ch1 + count1;


        char ch2 = nonDup.charAt(1);
        int count2 = 0;//2
        for (int i =0; i <= str.length()-1; i++){
            if (str.charAt(i) == ch2){
                count2++;
            }
        }
        expectedResult += ""+ch2 + count2;


        char ch3 = nonDup.charAt(2);
        int count3 = 0;//2
        for (int i =0; i <= str.length()-1; i++){
            if (str.charAt(i) == ch3){
                count3++;
            }
        }
        expectedResult += ""+ch3 + count3;
*/

        System.out.println(expectedResult);













    }
}
