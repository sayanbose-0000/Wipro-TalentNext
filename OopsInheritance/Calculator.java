public class Calculator {
  public static void main(String[] args) {
    System.out.println(powerInt(11, 3));
    System.out.println(powerDouble(12.33, 5));
  }

  static int powerInt(int num1, int num2) {
    return (int) Math.pow(num1, num2);
  }

  static double powerDouble(double num1, int num2) {
    return Math.pow(num1, num2);
  }
}
