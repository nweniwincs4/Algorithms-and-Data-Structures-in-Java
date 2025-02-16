
import java.util.ArrayList;
import java.util.Collections;

public class AdvancedSortingTest {
    static class Car{
        int year;
        String name;
        public Car(int year,String name){
            this.year=year;
            this.name=name;
        }
    }
    public static void main(String[] args) {
        Car c1= new Car(2010,"Mazda");
        Car c2 = new Car(2012,"Mazda");
        Car c3 = new Car(2012,"BMW");
        Car c4 = new Car(2012,"BMW");
        ArrayList<Car> myCars = new ArrayList<>();
        myCars.add(c1);
        myCars.add(c2);
        myCars.add(c3);
        myCars.add(c4);
        // Collections.sort(myCars, (obj1, obj2) -> {
        //     Car a = (Car) obj1;
        //     Car b = (Car) obj2;
        //     if (a.year < b.year) return -1;
        //     if (a.year > b.year) return 1;
        //     return 0;
        //   });
        
        Collections.sort(myCars,(obj1,obj2)->{
        Car c_obj1= (Car)obj1;
        Car c_obj2= (Car)obj2;
        if(c_obj1.year<c_obj2.year)
            return -1;
        else if(c_obj1.year>c_obj2.year)
            return 1;
        // return 0;
        else
            return c_obj1.name.compareTo(c_obj2.name); 
        });
        myCars.forEach(car->{System.out.printf("Car Brand : %s \t Model Year : %d \n",car.name,car.year);});
    }
}


