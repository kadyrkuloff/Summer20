package day24_arrays;

public class uniqueWords2 {
    public static void main(String[] args) {
        String[] words = {"Java", "C#", "C#", "Python", "Python", "C++", "Ruby"};
        for(String each : words){

        int count = 0;
        for(String b : words ){
            if (each.equals(b)){
                count++;
            }

        }
        if (count == 1){
            System.out.println(each);
        }

        }











    }
}
