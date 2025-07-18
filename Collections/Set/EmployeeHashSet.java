import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {
  public static void main(String[] args) {
    HashSet<String> employeeNames = new HashSet<>();

    employeeNames.addAll(Arrays.asList("Tony Stark", "Bruce Banner", "Wanda Maximoff", "Clint Barton", "Agatha Harkess"));

    Iterator<String> it = employeeNames.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
