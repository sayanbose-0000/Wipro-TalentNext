import java.util.Arrays;
import java.util.LinkedList;

public class MonthsLinkedList {
  public static void main(String[] args) {
    LinkedList<String> months = new LinkedList<String>();
    months.addAll(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    System.out.println(months);
  }
}