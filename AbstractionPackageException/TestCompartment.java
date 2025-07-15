import java.util.Random;

public class TestCompartment {
  public static void main(String[] args) {
    Compartment[] comp = new Compartment[10];
    Random rand = new Random();

    for (int i = 0; i < comp.length; i++) {
      int compRand = rand.nextInt(4) + 1;

      switch (compRand) {
        case 1:
          comp[i] = new FirstClass();
          break;

        case 2:
          comp[i] = new Ladies();
          break;

        case 3:
          comp[i] = new General();
          break;

        case 4:
          comp[i] = new Luggage();
          break;
      
        default:
          break;
      }
    }

    for (Compartment c : comp) {
      System.out.println(c.notice());
    }
  }
}

abstract class Compartment {
  public abstract String notice();
}

class FirstClass extends Compartment {
  @Override
  public String notice() {
    return "This is a First Class Compartment";
  }
}

class Ladies extends Compartment {
  @Override
  public String notice() {
    return "This is a Ladies Compartment";
  }
}

class General extends Compartment {
  @Override
  public String notice() {
    return "This is a General Compartment";
  }
}

class Luggage extends Compartment {
  @Override
  public String notice() {
    return "This is a Luggage Compartment";
  }
}