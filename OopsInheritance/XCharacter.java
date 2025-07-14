import java.util.Scanner;

public class XCharacter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String s = new String(sc.next());

    sc.close();

    if (s.charAt(0) == 'x' || s.charAt(0) == 'x') {
      String sNew = new String(s.substring(1, s.length() - 1));
      System.out.println(sNew);
    }

    else {
      System.out.println(s);
    }
  }
}
