public class MaxMinArr {
  public static void main(String[] args) {
    int[] arr = { 46, 86, 71, 23, 55 };

    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < smallest) smallest = arr[i];
      if (arr[i] > largest) largest = arr[i];
    }

    System.out.println("Largest val is : " + largest + " , Smallest val is: " + smallest);
  }
}
