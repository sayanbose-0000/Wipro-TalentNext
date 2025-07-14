public class Prime {
  public static void main(String[] args) {
    int val = Integer.parseInt(args[0]);
    int count = 0;

    for (int i = 2; i < val; i++)
      if (val % i == 0)
        count++;
  
    if (count == 0) System.out.println("Prime");
    else System.out.println("Non Prime");
  }
}