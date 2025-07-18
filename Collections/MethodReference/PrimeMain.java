interface PrimeChecker {
  MyPrime check(int n);
}

class MyPrime {
  MyPrime(int n) {
    if (isPrime(n)) {
      System.out.println("Prime");
    } else {
      System.out.println("Not Prime");
    }
  }

  private boolean isPrime(int num) {
    if (num <= 1)
      return false;
    if (num == 2)
      return true;
    if (num % 2 == 0)
      return false;
    for (int i = 3; i <= Math.sqrt(num); i += 2)
      if (num % i == 0)
        return false;
    return true;
  }
}

public class PrimeMain {
  public static void main(String[] args) {
    PrimeChecker pc = MyPrime::new;
    pc.check(17); 
    pc.check(18);
  }
}
