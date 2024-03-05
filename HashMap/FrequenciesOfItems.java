import java.util.LinkedHashMap;
import java.util.Map;

// print items and their frequencies according to the order of first appearance of elements
public class FrequenciesOfItems {
    public static void main(String[] args) {
        int[] arr={10,15,20,15,10,15};
        printFrequencies(arr);

    }
    static void printFrequencies(int[] arr){
        LinkedHashMap<Integer,Integer> lm = new LinkedHashMap<>();
        for(int i:arr){
            lm.put(i,lm.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>m : lm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(lm.entrySet());
    }
}
