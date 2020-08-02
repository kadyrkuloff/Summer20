package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class bulkOperations_practice {
    public static void main(String[] args) {

        ArrayList<String> stidents=new ArrayList<>();
        stidents.add("Sayeem");
        stidents.add("Waqar");
        stidents.add("Beslan");
        stidents.add("Dawud");
        stidents.add("Ramazan");
        stidents.add("Mehary");
        boolean r1 = stidents.containsAll(Arrays.asList("Ulku", "Busra", "Muhtar"));
        System.out.println(r1);

    }
}
