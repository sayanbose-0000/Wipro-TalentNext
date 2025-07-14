class SameLastDig {
  static boolean isDigit(int a, int b) {
    if ((a % 10) == (b % 10)) return true;
    else return false;    
  }

  public static void main(String[] args) {
    boolean isSame = isDigit(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    if (isSame) System.out.println("True");
    else System.out.println("False");
  }
}