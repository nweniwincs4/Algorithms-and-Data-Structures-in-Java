import java.util.HashMap;

public class HashMapTest {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
    for(String k: capitalCities.keySet()){
        System.out.printf("Key : %s \t Value : %s \n", k, capitalCities.get(k));
        // System.out.printf("%s : %s \n", k, capitalCities.get(k));
    }
  }
}