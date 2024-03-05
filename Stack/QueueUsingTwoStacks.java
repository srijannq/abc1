import  java.util.*;
public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        StackQueue s = new StackQueue();
        s.Push(2);
        s.Push(3);
        int x=s.Pop();
        s.Push(4);
        int y= s.Pop();
        System.out.println(x+" "+y);

    }

}
class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
        // Your code here
        s1.push(x);
    }


    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
        // Your code here

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        if(s2.isEmpty())return -1;

        int res=s2.pop();

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return res;
    }
}
