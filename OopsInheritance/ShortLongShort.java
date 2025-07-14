import java.util.Scanner;

public class ShortLongShort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first: ");
    String first = new String(sc.next());

    System.out.print("Enter second: ");
    String second = new String(sc.next());

    sc.close();

    if (first.length() == second.length()) {
      System.out.println("Can't have same length!");
    }

    else if (first.length() < second.length()) {
      System.out.println(first + second + first);
    }

    else {
      System.out.println(second + first + second);
    }
  }
}
