class PosNegMain {
  public static void main(String[] args) {
    int val = Integer.parseInt(args[0]);
    if (val > 0) System.out.println(val + " is positive");
    else if (val < 0) System.out.println(val + " is negative"); 
    else System.out.println(val + " is zero");
  }
}