import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class Lambda {
    static void printCond(Collection<Integer> c, Predicate<Integer> p ){
        for(Integer x:c){
            if(p.test(x)) System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(5,7,10,11,20,3,30));
        printCond(a,x->x%2==0);
    }
}
