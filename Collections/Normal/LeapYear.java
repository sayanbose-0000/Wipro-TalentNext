import java.time.LocalDate;
import java.time.Year;

public class LeapYear {
  public static void main(String[] args) {
    int year = LocalDate.now().getYear();

    if (Year.isLeap(year)) {
      System.out.println(year + " is Leap Year");
    } else {
      System.out.println(year + " is Not Leap Year");
    }
  }
}