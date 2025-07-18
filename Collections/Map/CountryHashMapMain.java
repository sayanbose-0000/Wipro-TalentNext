import java.util.ArrayList;
import java.util.HashMap;

class CountryHashMap {
  HashMap<String, String> m1 = new HashMap<>();
  HashMap<String, String> m2 = new HashMap<>();

  HashMap<String, String> saveCountryCapital(String countryName, String capital) {
    m1.put(countryName, capital);
    return m1;
  }

  String getCapital(String countryName) {
    return m1.get(countryName);
  }

  String getCountry(String capitalName) {
    for (String country : m1.keySet()) {
      if (m1.get(country).equals(capitalName)) {
        return country;
      }
    }

    return null;
  }

  void reverseMap() {
    HashMap<String, String> m2 = new HashMap<>();
    for (String country : m1.keySet()) {
      m2.put(m1.get(country), country);
    }

    System.out.println(m2);
  }

  ArrayList<String> getAllCountries() {
    ArrayList<String> coutries = new ArrayList<>();

    for (String country : m1.keySet()) {
      coutries.add(country);
    }

    return coutries;
  }
}

public class CountryHashMapMain {
  public static void main(String[] args) {
    CountryHashMap ch = new CountryHashMap();

    ch.saveCountryCapital("India", "Delhi");
    ch.saveCountryCapital("US", "Washington DC");
    ch.saveCountryCapital("UK", "London");
    ch.saveCountryCapital("Bangladesh", "Dhaka");


    System.out.println("All countries");
    System.out.println(ch.getAllCountries());

    System.out.println("Capital for US");
    System.out.println(ch.getCapital("UK"));

    System.out.println("Country whose capital is Delhi is");
    System.err.println(ch.getCountry("Delhi"));

    System.out.println("Reverse");
    ch.reverseMap();
  }
}