// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
  public static void main(String[] args) {

    // Make a collection
    ArrayList<Integer> cars = new ArrayList<>();
    cars.add(1);
    cars.add(3);
    cars.add(4);
    cars.add(5);

    // Get the iterator
    Iterator it = cars.iterator();

    // Print the first item
    System.out.println(it.next());
    while(it.hasNext()){
        System.out.println(Integer.parseInt(it.next().toString())*10);
    }
  }
}
