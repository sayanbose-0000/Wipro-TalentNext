import java.util.Arrays;
import java.util.Vector;

public class MonthsVector {
  public static void main(String[] args) {
    Vector<String> months = new Vector<String>();
    months.addAll(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    System.out.println(months);
  }
}