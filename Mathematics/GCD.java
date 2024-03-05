public class GCD {
    public static void main(String[] args) {
        System.out.println(findGcd(100,200));

    }
    static int findGcd(int a,int b){
        int min=Math.min(a,b);
        while(min>0){
            if(a%min==0 && b%min==0)
                break;
            min--;
        }
        return min;
    }
}
