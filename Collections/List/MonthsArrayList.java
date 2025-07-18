import java.util.ArrayList;
import java.util.Arrays;

public class MonthsArrayList {
  public static void main(String[] args) {
    ArrayList<String> months = new ArrayList<String>();
    months.addAll(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    System.out.println(months);
  }
}
