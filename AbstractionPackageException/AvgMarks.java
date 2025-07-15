import java.util.Scanner;

class NegativeValueException extends Exception {
}

class ValueOutOfRangeException extends Exception {
}

public class AvgMarks {
  public static void main(String[] args) throws NumberFormatException, NegativeValueException, ValueOutOfRangeException {
    Scanner sc = new Scanner(System.in);

      System.out.println("Enter name: ");
      String name = sc.nextLine();

      System.out.println("Ebter marks in maths: ");
      int mathMarks = Integer.parseInt(sc.next());

      System.out.println("Ebter marks in science: ");
      int scienceMarks = Integer.parseInt(sc.next());

      System.out.println("Ebter marks in english: ");
      int englishMarks = Integer.parseInt(sc.next());

      sc.close();
      
      if (mathMarks < 0 || scienceMarks < 0 || englishMarks < 0) throw new NegativeValueException();
      if (mathMarks > 100 || scienceMarks > 100 || englishMarks > 100) throw new ValueOutOfRangeException();

      System.out.println("The average for " + name +" is: " + ((mathMarks + scienceMarks + englishMarks) / 3));

  }
}
