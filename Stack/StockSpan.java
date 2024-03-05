import  java.util.*;


public class StockSpan {
    public static void main(String[] args) {
        int arr[] = {60, 10, 20, 40, 35, 30, 50, 70, 65};
        span(arr);

    }
    static void span(int[] arr){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        int spanNo=1;
        for(int i=0;i< arr.length;i++){
            while(!stack.isEmpty() && arr[i]>=arr[stack.peek()])stack.pop();
            spanNo=stack.isEmpty()?i+1:i-stack.peek();
            System.out.print(spanNo+" ");
            stack.push(i);
        }


    }
}
