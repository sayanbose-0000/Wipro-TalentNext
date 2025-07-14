import java.util.Scanner;

public class StarCharacter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String s = new String(sc.next());

    sc.close();

    int pos = s.indexOf("*");

    if (pos == -1) {
      System.err.println("No * present");
      return;
    }

    String sNew = new String();
    if (pos == 0) {
      sNew = s.substring(2);
    } else if (pos == s.length() - 1) {
      sNew = s.substring(0, pos - 1);
    } else {
      sNew = s.substring(0, pos - 1) + s.substring(pos + 2);
    }

    System.out.println(sNew);
  }
}
