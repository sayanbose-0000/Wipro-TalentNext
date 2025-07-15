import java.util.Scanner;

public class DecBin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a num (1-255): ");
    int num = Integer.parseInt(sc.next());
    sc.close();

    if (num < 1 || num > 255) {
      System.out.println("Number must be between 1 and 255");
      return;
    }

    String rawBinary = Integer.toBinaryString(num);
    String bin = String.format("%8s", rawBinary).replace(' ', '0');
    System.out.println("Binary is: " + bin);
  }
}
