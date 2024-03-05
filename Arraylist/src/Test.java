
// public class Test {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(155);
//         list.add(1220);
//         list.add(1330);
//         list.add(125);
//         list.add(1);
//         System.out.println("Array List Before Sorting: " + list);
//         Collections.sort(list);
//         System.out.println("Array List After Sorting: " + list);
//         System.out.println("Enter the Number You Want to Search: ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if(list.contains(num)){
//             System.out.println(num+" is Present in the Array List");
//         }
//         else{
//             System.out.println(num+" is Not Present in the Array List");
//         }
//         for(int i:list){
//             System.out.println(i);
//         }
//         System.out.println("Enter the Number You Want to Remove: ");
//         int num1 = sc.nextInt();
//         if (list.contains(num1)) {
//             list.remove(list.indexOf(num1));
//             System.out.println("Array List After Removing: " + list);
//         } else {
//             System.out.println(num1 + " is Not Present in the Array List");
//         }


//     }
// }        

//This program sorts an array list of integers in ascending order and checks if the list contains a given number and removes the specified number from the list.        

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(2,85);
        list.remove(Integer.valueOf(50));
        list.clear();
        System.out.println(list);
    }
}
