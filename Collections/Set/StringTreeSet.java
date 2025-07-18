import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class StringTreeSet {
  public static void main(String[] args) {
    TreeSet<String> stringObj = new TreeSet<>();
    
    stringObj.add("India");
    stringObj.add("America");
    stringObj.add("Japan");

    System.out.println("Reversed");
    stringObj.reversed();
    Iterator<String> it1 = stringObj.descendingIterator();
    while (it1.hasNext()) {
      System.out.println(it1.next());
    }
    
    System.out.println();

    System.out.println("All ele (Iterator): ");
    Iterator<String> it2 = stringObj.iterator();
    while (it2.hasNext()) {
      System.out.println(it2.next());
    }
    
    System.out.println();

    System.out.println("Enter country to search: ");
    Scanner sc = new Scanner(System.in);
    String country = sc.next();
    sc.close();
    
    for (String c : stringObj) {
      if (c.equals(country)) {
        System.out.println("Exists");
        return;
      }
    }
    System.out.println("Doesn't exist");
  }
}
