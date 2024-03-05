public class FactorialN {
    public static void main(String[] args) {
        System.out.println(factorial(6));

    }
// Recursive Solution
//    static int factorial(int n){
//        if(n==0)
//            return 1;
//        return n*factorial(n-1);
//    }
// Iterative Solution
    static int factorial(int n){
        int res=1;
        for(int i=2;i<=n;i++){
            res*=i;
        }
        return res;
    }
}
