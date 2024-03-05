import java.util.LinkedList;
import java.util.ListIterator;

public class JosephusProblem {
    public static void main(String[] args) {
        int x=josephus(7,3);
        System.out.println(x);

    }
    static int josephus(int n,int k){
        LinkedList<Integer> l=new LinkedList<>();
        for(int i=0;i<n;i++){
            l.add(i);
        }
        ListIterator<Integer>it=l.listIterator();
        while(l.size()>1){
            int count=0;
           while (count<k){
                while (it.hasNext() && count < k) {
                    it.next();
                    count++;

                }
                if (count < k) {
                    it = l.listIterator();
                    it.next();
                    count++;
                }
            }
            it.remove();
        }
        return l.getFirst();
    }
}
