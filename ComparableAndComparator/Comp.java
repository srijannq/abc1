import java.util.Arrays;
import java.util.Comparator;

public class Comp {
    public static void main(String[] args) {
        Point[] p = {new Point(10,20),new Point(5,10),new Point(2,11)};
        Arrays.sort(p, Comparator.comparingInt(p2 -> p2.x));
        System.out.println(Arrays.toString(p));

        
    }
}
class Point{
    int x;
    int y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}

