// Import the HashSet class
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetTest {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
    System.out.println("******************");
    ArrayList<String> cars_list= new ArrayList<>(cars);
    Collections.sort(cars_list);
    for (String i : cars_list) {
        System.out.println(i);
    }
    System.out.println("******************");
    try{
        for (int i=0;i<=cars_list.size();i++) {
            System.out.println(cars_list.get(i));
        }
    }catch(IndexOutOfBoundsException e){
        System.out.println(e.getMessage());
    }
    System.out.println(cars.size());
  }
}
