import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Iterator {
    public static void main(String[] args) {
        List<Integer> l =new ArrayList<>(Arrays.asList(5,10,20,30,50));
        ListIterator<Integer>it =l.listIterator();
        while(it.hasNext()){
            int x=it.next();
            it.set(x*2);


        }
        System.out.println(l);
    }
}
