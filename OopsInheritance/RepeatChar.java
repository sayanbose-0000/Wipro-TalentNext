import java.util.Scanner;

public class RepeatChar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String s = new String(sc.next());
    
    System.out.print("Enter repeat: ");
    int repeat = sc.nextInt();

    sc.close();

    String sub = s.substring(s.length() - repeat);
    StringBuilder sNew = new StringBuilder(sub);

    for (int i = 1; i < repeat; i++) {
      sNew = sNew.append(sub);
    }

    System.out.println(sNew);
  }
}
