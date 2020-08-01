package office_hours.july_06_2020;

public class quiz {
    public static void main(String[] args) {
        String str = " ";
           str = str.trim();
        System.out.println(str.isEmpty());
    String ta = "A ";
    ta = ta.concat("B ");
    String tb = "C ";
    ta = ta+tb;
    ta.replace('C', 'D');//not assigned to ta
    ta = ta + tb; //ABCC



    }
}
