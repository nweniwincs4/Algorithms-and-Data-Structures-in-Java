import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class ListSortingTest {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    Collections.sort(cars);  // Sort cars in ascending order
    System.out.println(cars.get(0));

    for (String i : cars) {
      System.out.println(i);
    }

    System.out.println("----------------Reversed Order");
    Collections.sort(cars,Collections.reverseOrder());
    for (String i : cars) {
      System.out.println(i);
    }
  }
}