import java.util.ArrayList;

public class SampleProblems {
    public static void main(String[] args) {
        int[] arr={17, 10, 20, 13, 7, 9};
        int k=15;
        ArrayList<Integer> li=smaller(arr,k);
        System.out.println(li);
    }
    static ArrayList<Integer> smaller(int[] arr,int k){
        ArrayList<Integer> l =new ArrayList<>();
        for(int i:arr){
            if(i<k){
                l.add(i);
            }
        }

        return l;
    }
}
