import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesCapital {
  public static void main(String[] args) {
    Properties states = new Properties();

    states.put("West Bengal", "Kolkata");
    states.put("Rajasthan", "Jaipur");
    states.put("Maharashtra", "Mumbai");
    states.put("Karnataka", "Bangalore");

    Set<Object> statesNames = states.keySet();
    Iterator<Object> it = statesNames.iterator();

    while (it.hasNext()) {
      String state = (String) it.next();
      String capital = states.getProperty(state);

      System.out.println(state + " | " + capital);
    }
  }
}
