import java.util.Optional;

class InvalidUserException extends RuntimeException {
  public InvalidUserException(String mssg) {
    super(mssg);
  }
}

class Employee {}

public class InvalidUser {
  public static void main(String[] args) {
    Employee emp = null;
    
    Optional.ofNullable(emp).orElseThrow(() -> new InvalidUserException("Invalid User"));
  }
}
