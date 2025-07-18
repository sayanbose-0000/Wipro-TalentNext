import java.util.HashSet;

class CountrySet {
  HashSet<String> h1  = new HashSet<>();
 
  HashSet<String> saveCountryNames(String countryName) {
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

public class CountryMain {
  public static void main(String[] args) {
    CountrySet cs = new CountrySet();

    cs.saveCountryNames("India");
    cs.saveCountryNames("America");
    cs.saveCountryNames("Italy");
    cs.saveCountryNames("Australia");
    cs.saveCountryNames("Switzerland");

    System.out.println(cs.getCountry("China") ? "Found" : "Not found");
  }
}
