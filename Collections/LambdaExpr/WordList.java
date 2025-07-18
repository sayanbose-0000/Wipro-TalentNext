import java.util.ArrayList;
import java.util.Arrays;

public class WordList {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.addAll(Arrays.asList("Tony Stark", "Steve Rogers", "Thor Odinson", "Steven Strange", "Wanda Maximoff",
        "Agatha Harkess", "Peter Parker", "Norman Osborne", "Harry Osborne", "May Parker"));

    al.forEach(a -> System.out.println(a));
  }
}
