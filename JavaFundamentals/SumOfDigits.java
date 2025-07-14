public class SumOfDigits {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);

    int sum = 0;
    while (num != 0) {
      int rem = num % 10;
      sum += rem;
      num = num / 10; 
    }

    System.out.println("Sum of digits is " + sum);
  }
}