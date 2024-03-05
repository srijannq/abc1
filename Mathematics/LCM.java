public class LCM {
    public static void main(String[] args) {
        System.out.println(findLCM(2,8));

    }
    static int findLCM(int a,int b){
        return (a*b)/findGCD(a,b);
    }
    static int findGCD(int a,int b){
        if(b==0) return a;
        return findGCD(b,a%b);
    }
}
