public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println(primeOrNot(1031));

    }
    static boolean primeOrNot(int n){
        if(n==1)return false;
        if(n==2||n==3)return true;
        if(n%2==0 )return false;
        if(n%3==0 )return false;
        for(int i=5;i<Math.sqrt(n);i+=6){
            if(n%i==0||n%(i+2)==0)return false;
        }
        return true;
    }
}
