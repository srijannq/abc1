public class TrailingZeroInFactorial {
    public static void main(String[] args) {
        System.out.println(trailingZeroCount(100));

    }
    //naive solution
//    static long trailingZeroCount(long n){
//        long fac=1;
//        for(int i=2;i<=n;i++)
//            fac*=i;
//        if(fac%10!=0)
//            return 0;
//        long ans=0;
//        while(fac>0 && fac%10==0){
//            ans++;
//            fac/=10;
//        }
//        return ans;
//
//    }
//    efficient solution

    static int trailingZeroCount(int n){
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res+=n/i;
        }
        return res;
    }
}
