import java.util.Optional;
import java.util.StringJoiner;

public class Main {
  public static void main(String[] args) {
    Optional<String> name = Optional.of(null);

    System.out.println(name.get());
  }
}