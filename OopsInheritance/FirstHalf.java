import java.util.Scanner;

public class FirstHalf {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String s = new String(sc.next());
    sc.close();

    if (s.length() % 2 != 0) {
      System.out.println("null");
      return;
    }

    for (int i = 0; i < s.length() / 2; i++) {
      System.out.print(s.charAt(i));
    }

    System.out.println();
  }
}
