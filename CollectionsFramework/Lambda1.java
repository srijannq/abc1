import java.util.Arrays;

public class Lambda1 {
    public static void main(String[] args) {
        String[] arr1={"apple","bat","cat"};
        String[] arr2={"Apple","Bat","Cat"};
        if(Arrays.equals(arr1,arr2,String::compareToIgnoreCase)) System.out.println("Yes");
        else System.out.println("No");

    }
}
