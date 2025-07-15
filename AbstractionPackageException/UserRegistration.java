import java.util.Scanner;

class InvalidCountryException extends Exception {
  InvalidCountryException() {
    super();
  }

  InvalidCountryException(String mssg) {
    super(mssg);
  }
}

public class UserRegistration {
  static void registerUser(String username, String userCountry) throws InvalidCountryException {
    if (!userCountry.toLowerCase().equals("india")) {
      throw new InvalidCountryException("User Outside India cannot be registered");
    } else {
      System.out.println("User registration done successfully");
    }
  }

  public static void main(String[] args) throws InvalidCountryException {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name: ");
    String username = sc.next();

    System.out.println("Enter country");
    String userCountry = sc.next();

    registerUser(username, userCountry);

    sc.close();
  }
}
