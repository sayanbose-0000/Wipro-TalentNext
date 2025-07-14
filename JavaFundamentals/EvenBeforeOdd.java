import java.util.Scanner;

public class EvenBeforeOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size: ");
    int size = sc.nextInt();

    System.out.print("Enter arr: ");
    int[] arr = new int[size];
    
    
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    
    int[] newArr = new int[size];
    int m = 0, n = size - 1;
    for (int i = 0; i < size; i++) {
      if (arr[i] % 2 == 0) newArr[m++] = arr[i];
      else newArr[n--] = arr[i]; 
    }

    for (int i = 0; i < size; i++) {
      System.out.print(newArr[i] + " ");
    }
    
    System.err.println();

    sc.close();
  }
}