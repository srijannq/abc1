import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Abc obj = new Abc();



    }
}


class Abc extends JFrame
{
    public Abc(){

        JLabel l = new JLabel("Hello World"); 
        JLabel p = new JLabel("Welcome Srijan");

        add(l);
        add(p);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
