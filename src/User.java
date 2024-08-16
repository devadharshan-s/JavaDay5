import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class User {
    static LocalDate DOB;
    static void isRetired(LocalDate date) {
        System.out.println(date.getDayOfWeek().toString());
        if(Period.between(DOB, date).getYears() >= 58) System.out.println("Retired");
        else System.out.println("Not retired");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DOB: YYYY-MM-DD");
        try {
            String dob = sc.nextLine();
            DOB = LocalDate.parse(dob);
            //DOB = LocalDate.parse(DOB, DateTimeFormatter.ofPattern("DD-MM-YYYY"));
            isRetired(DOB);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid Date");
        }
    }
}
