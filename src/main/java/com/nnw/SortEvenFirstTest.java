
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortEvenFirstTest {
    static class SortEvenFirst implements Comparator{
        @Override
        public int compare(Object o1,Object o2){
            Integer n1 = (Integer)o1;
            Integer n2 = (Integer)o2;
            boolean isEven1 = n1%2 == 0;
            boolean isEven2 = n2%2 == 0;
            if (isEven1==isEven2)
                return 0;
            else if(isEven1)
                return -1;
            else 
                return 1; 
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(2);
        list.add(3);
        Comparator myComparator= new SortEvenFirst();
        Collections.sort(list,myComparator);
        list.forEach(num->{System.out.println(num);});
    }
}
