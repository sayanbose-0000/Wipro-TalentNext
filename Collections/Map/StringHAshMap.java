import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringHAshMap {
  static HashMap<String, String> hMap = new HashMap<>();

  static boolean getKey(String name) {
    for (String it : hMap.keySet()) {
      if (it.equals(name))
        return true;
    }
    return false;
  }

  static boolean getValue(String name) {
    for (String it : hMap.values()) {
      if (it.equals(name))
        return true;
    }
    return false;
  }

  public static void main(String[] args) {
    hMap.put("Harry Potter", "JK Rowling");
    hMap.put("Nightingale", "Kristin Hannah");
    hMap.put("The White Tiger", "Aravind Adiga");
    hMap.put("Feluda", "Satyajit Ray");

    System.out.println("Check if key exists: Harry Potter");
    System.out.println(hMap.containsKey("Harry Potter")? "Found" : "Not Found");

    System.out.println("Check if value exists: Kristin Hannah");
    System.out.println(hMap.containsValue("Kristin Hannah") ? "Found" : "Not Found");

    System.out.println("All values");
    Iterator<String> it = hMap.keySet().iterator();

    while (it.hasNext()) {
      String key = it.next();
      System.out.println(key + " -> " + hMap.get(key));
    }
  }
}