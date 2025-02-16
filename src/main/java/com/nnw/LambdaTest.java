import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaTest {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);

    ArrayList<String> arr = new ArrayList<>();
    arr.add("Soe");
    arr.add("Hla");

    // numbers.forEach((n) -> { System.out.println(n); });
    Consumer<Object> method = (n) -> { System.out.println(n); };
    numbers.forEach( method );
    arr.forEach(method);
    System.out.println("----------------");
    StringFunction123 exclaim = (s) -> s + "!";
    StringFunction123 ask = (s) -> s + "?";
    printFormatted("Hello", exclaim);
    printFormatted("Hello", ask);
  }
  private static void printFormatted(String str, StringFunction123 format) {
    String result = format.run(str);
    System.out.println(result);
  }
}

interface StringFunction123 {
    String run(String str);
}