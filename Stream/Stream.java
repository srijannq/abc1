import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
//        List<Integer> l =new ArrayList<>(Arrays.asList(10,5,4,2,12,16,17));
//        int s= (int) l.stream().filter(x->x%2==0).filter(x->x>=10).count();
//        System.out.println(s);
        int[] arr={20,1};
        int max=Arrays.stream(arr).max().getAsInt();
        System.out.println(max);

    }

}
