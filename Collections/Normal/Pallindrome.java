import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Pallindrome {
  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<>(
        Arrays.asList("madam", "hello", "racecar", "apple", "level", "world", "noon", "java", "civic", "kayak"));

    Predicate<String> isPalindrome = w -> w.equalsIgnoreCase(new StringBuilder(w).reverse().toString());

    words.stream()
        .filter(isPalindrome)
        .forEach(w -> System.out.println(w));
  }
}
