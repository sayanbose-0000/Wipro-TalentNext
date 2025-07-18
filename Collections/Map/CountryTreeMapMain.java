import java.util.ArrayList;
import java.util.TreeMap;

class CountryTreeMap {
  TreeMap<String, String> m1 = new TreeMap<>();
  TreeMap<String, String> m2 = new TreeMap<>();

  TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
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
    m2.clear(); // optional: clear previous contents
    for (String country : m1.keySet()) {
      m2.put(m1.get(country), country);
    }
    System.out.println(m2);
  }

  ArrayList<String> getAllCountries() {
    ArrayList<String> countries = new ArrayList<>();
    for (String country : m1.keySet()) {
      countries.add(country);
    }
    return countries;
  }
}

public class CountryTreeMapMain {
  public static void main(String[] args) {
    CountryTreeMap ch = new CountryTreeMap();

    ch.saveCountryCapital("India", "Delhi");
    ch.saveCountryCapital("US", "Washington DC");
    ch.saveCountryCapital("UK", "London");
    ch.saveCountryCapital("Bangladesh", "Dhaka");

    System.out.println("All countries");
    System.out.println(ch.getAllCountries());

    System.out.println("Capital for UK");
    System.out.println(ch.getCapital("UK"));

    System.out.println("Country whose capital is Delhi is");
    System.out.println(ch.getCountry("Delhi"));

    System.out.println("Reverse");
    ch.reverseMap();
  }
}
