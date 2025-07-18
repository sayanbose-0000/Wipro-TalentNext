import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileCharacterCount {
  public static void main(String[] args) throws FileNotFoundException, IOException {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the file name");
    String fileName = sc.nextLine();

    System.out.println("Enter the character to be counted");
    char charToFind = sc.nextLine().toLowerCase().charAt(0);

    FileReader fr = new FileReader(fileName);
    int count = 0;
    int c = fr.read();

    while (c != -1) {
      if (Character.toLowerCase((char) c) == charToFind) {
        count++;
      }
      c = fr.read();
    }

    System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + charToFind + "'.");

    sc.close();
    fr.close();
  }
}