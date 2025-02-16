  
public class EnumTest { 

    enum Gender{
        MALE,
        FEMALE
    }
    public static void main(String[] args) { 
      for (Level myVar : Level.values()) {
        System.out.println(myVar);
      }
      System.out.println("-----------------------");
      Gender m = Gender.MALE;
      System.out.println(m);
      System.out.println("-----------------------");
      System.out.println(Math.sqrt(100000));
      System.out.println(Math.pow(100, 2));
      System.out.println(Math.PI);
      System.out.println("-----------------------");
      System.out.println(Math.random()*101);
      java.util.Random r= new java.util.Random();
      int num  = r.nextInt(1, 3);
      System.out.println(num);

    } 
}
enum Level {
    LOW,
    MEDIUM,
    HIGH
}
