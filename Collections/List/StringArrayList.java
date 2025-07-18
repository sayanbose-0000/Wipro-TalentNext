import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {
  static ArrayList<String> stringArrayList = new ArrayList<String>();

  static void printAll() {
    Iterator<String> it = stringArrayList.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

  public static void main(String[] args) {
    stringArrayList.add("Tony Stark");
    stringArrayList.add("Steve Rogers");
    stringArrayList.add("Clint Barton");
    stringArrayList.add("Bruce Banner");
    stringArrayList.add("Natasha Romanoff");
    stringArrayList.add("Wanda Maximoff");

    printAll();
  }
}
