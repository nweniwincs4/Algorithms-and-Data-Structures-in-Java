import java.time.LocalDate; // import the LocalDate class
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTest {
  public static void main(String[] args) {
    LocalDate obj1 = LocalDate.now(); // Create a date object
    System.out.printf("Local Date : %s \n",obj1); // Display the current date
    LocalTime obj2 = LocalTime.now();
    System.out.printf("Local Time : %s \n",obj2);
    LocalDateTime obj3 = LocalDateTime.now();
    System.out.printf("Local Date Time : %s \n",obj3);
    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formatted_obj3 = obj3.format(df);
    System.out.printf("Local Date Time After format : %s \n",formatted_obj3);
  }
}