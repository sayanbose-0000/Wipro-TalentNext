import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElement {
  public static void main(String[] args) {
    System.out.print("Enter arr: ");
    int[] arr = new int[6];
    
    Scanner sc = new Scanner(System.in);
    
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    
    HashSet<Integer> hs = new HashSet<Integer>();
    
    for (int i = 0; i < arr.length; i++) {
      if (!hs.contains(arr[i])) {
        hs.add(arr[i]);
        System.out.print(arr[i] + " ");
      }
    }

    System.err.println();

    sc.close();
  }
}
