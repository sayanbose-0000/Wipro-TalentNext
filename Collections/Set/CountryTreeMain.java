import java.util.TreeSet;

class CountryTree {
  TreeSet<String> h1  = new TreeSet<>();
 
  TreeSet<String> saveCountryNames(String countryName) {
    h1.add(countryName);
    return h1;
  }

  boolean getCountry(String countryName) {
    for (String country : h1) {
      if (country == countryName) {
        return true;
      }
    }

    return false;
  }
}

public class CountryTreeMain {
  public static void main(String[] args) {
    CountrySet cs = new CountrySet();

    cs.saveCountryNames("India");
    cs.saveCountryNames("America");
    cs.saveCountryNames("Italy");
    cs.saveCountryNames("Australia");
    cs.saveCountryNames("Switzerland");

    System.out.println(cs.getCountry("Switzerland") ? "Found" : "Not found");
  }
}
