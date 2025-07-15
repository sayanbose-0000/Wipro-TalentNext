import java.util.Scanner;

public class ArrayException {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Enter the number of elements in the array");
      int size = Integer.parseInt(sc.nextLine()); // sc.nextInt() gives InputMismatchException, to get NumberFormatException, parse manually

      int[] arr = new int[size];

      System.out.println("Enter the elements in the array");
      for (int i = 0; i < size; i++) {
        arr[i] = Integer.parseInt(sc.nextLine());
      }

      System.out.println("Enter the index of the array element you want to access");
      int idx = Integer.parseInt(sc.nextLine());

      System.out.println("The array element at index " + idx + " = " + arr[idx]);
      System.out.println("The array element successfully accessed");

    }
    
    catch (ArrayIndexOutOfBoundsException aioobe) {
      System.out.println(aioobe);
    }
    
    catch (NumberFormatException nfe) {
      System.out.println(nfe);
    }

    finally {
      sc.close();
    }
  }
}