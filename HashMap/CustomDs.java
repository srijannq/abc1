//design a data structure to store user ids and balances
import java.util.HashMap;

public class CustomDs {
    public static void main(String[] args) {
        DS d= new DS();
        d.set(1,100);
        d.set(2,2000);
        d.set(1,5000);
        System.out.println(d.get(1));
        System.out.println(d.get(2));

    }
}
class DS{
    HashMap<Integer,Integer> hm = new HashMap<>();
    void set(int k,int v){
        hm.put(k,v);
    }
    int get(int k){
        if(hm.containsKey(k)){
            return hm.get(k);
        }
        return -1;
    }

}
