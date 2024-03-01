package GUI;

import javax.swing.*;
import java.awt.*;

class MyFrame6 extends JFrame{
    JButton b1=new JButton("Button 1");
    JButton b2=new JButton("Button 2");
    JButton b3=new JButton("Button 3");
    JButton b4=new JButton("Button 4");
    JButton b5=new JButton("Button 5");
    MyFrame6(){
        setTitle("Grid Layout");
        setBounds(100,100,800,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        GridLayout g=new GridLayout(3,2);
        g.setHgap(30);
        g.setVgap(30);
        c.setLayout(g);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4,0);
        c.add(b5,0);  //first place
        setVisible(true);

    }

}

public class GridLayoutDemo {
    public static void main(String[] args) {
        new MyFrame6();
    }
}