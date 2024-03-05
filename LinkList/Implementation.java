import java.util.LinkedList;

public class Implementation {
    public static void main(String[] args) {
//        LinkedList<Integer> li=new LinkedList<>();
//        li.add(10);
//        li.add(20);
//        li.add(30);
//        System.out.println(li);
        MyDS m=new MyDS();
        m.add(10);
        m.add(20);
        m.add(10);
        m.removeAndPrint(30);

    }

}
class MyDS{
    LinkedList<Integer>l=new LinkedList<>();
    void add(int x){
        l.add(x);
    }
    void removeAndPrint(int x){
        while (l.contains(x)){
            l.remove(Integer.valueOf(x));
        }
        System.out.println(l);
    }
}
