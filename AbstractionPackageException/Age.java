class AgeLessThanEighteenOrGreaterThanSixtyException extends Exception {
  public AgeLessThanEighteenOrGreaterThanSixtyException(String mssg) {
    super(mssg);
  }
}

public class Age {
  public static void main(String[] args) throws AgeLessThanEighteenOrGreaterThanSixtyException {
    int age = Integer.parseInt(args[0]);
    if (age < 18 || age > 60) {
      throw new AgeLessThanEighteenOrGreaterThanSixtyException("Age less than 18 or greater than 60");
    }

    System.out.println("You are of age");
  }
}
