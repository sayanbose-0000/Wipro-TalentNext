import java.util.ArrayList;
import java.util.function.Consumer;

public class OddEvenCheck {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();

    for (int i = 1; i <= 10; i++) {
      al.add(i);
    }

    Consumer<Integer> printOdd = n -> {
      System.out.println(n + " is " + (n % 2 == 0 ? "Even" : "Odd"));
    };

    al.forEach(printOdd);
  }
}