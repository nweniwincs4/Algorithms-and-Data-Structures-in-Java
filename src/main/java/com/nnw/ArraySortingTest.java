import java.util.Arrays;

public class ArraySortingTest {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
    System.out.println("Ascending order : ");
    Arrays.sort(cars);
    for (String i : cars) {
        System.out.println(i);
    }
    System.out.printf("Lowest value : %s \n",cars[0]);
    System.out.printf("Highest value : %s \n",cars[cars.length-1]);
    System.out.println("------------------------");
    System.out.println("Descending order : ");
    Arrays.sort(cars,(obj1,obj2)->{
    	int comp = obj1.compareTo(obj2);
        return comp*-1;
    });
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
