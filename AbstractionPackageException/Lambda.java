public class Lambda {
  public static void main(String[] args) {
    Test t1 = (a, b, c) -> a + b + c;
    Test t2 = (a, b, c) -> a * b * c;

    System.out.println(t1.myFunction(2, -1, 4));
    System.out.println(t2.myFunction(7, -3, 2));
  }
}

interface Test {
  abstract int myFunction(int a, int b, int c);
}
