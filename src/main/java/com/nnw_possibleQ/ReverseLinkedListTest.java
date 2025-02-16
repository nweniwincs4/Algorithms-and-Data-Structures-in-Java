
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedListTest {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(40);
        list.add(20);
        list.add(30);
        // Collections.sort(list,Collections.reverseOrder());
        Collections.sort(list,(o1,o2)->{
            int res;
            if (o1<o2)
                res = -1;
            else if (o1>o2)
                res = 1;
            else
                res = 0;
            res *=-1;
            return res;
        });
        list.forEach(item->{System.out.println(item);});
    }
}
