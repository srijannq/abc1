public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(367));

    }
    static boolean isPalindrome(int n){
        int x=n;
        int rev=0;
        while (x>0){
            int p=x%10;
            rev=rev*10+p;
            x/=10;
        }
        return rev==n;
    }
}
