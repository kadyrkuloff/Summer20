package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class practice02 {
    public static void main(String[] args) {
        String[] students = {"Kalbinur", "Virginia", "Odina", "Ernis", "Isa", "Ertur", "Diliara"};
        LocalDate[] birthDays = {LocalDate.of(1982,12,26), LocalDate.of(1993,11,25), LocalDate.of(1980,05,23), LocalDate.of(1990,2,21), LocalDate.of(1982,11,28),LocalDate.of(1988,1,21),LocalDate.of(1989,04,21)};
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE ");
        for(int i = 0; i<=students.length-1; i++){
            System.out.println(students[i]+" : "+birthDays[i].format(dateFormat));
        }










    }
}
