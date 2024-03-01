package GUI;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("Border Layout");
        jf.setBounds(100,100,600,500);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=new Container();
        c=jf.getContentPane();

        JButton b1=new JButton("North");
        JButton b2=new JButton("South");
        JButton b3=new JButton("East");
        JButton b4=new JButton("Center");
        JButton b5=new JButton("West");

        BorderLayout BL=new BorderLayout();
        c.setLayout(BL);

        c.add(b1,BorderLayout.NORTH);
        c.add(b2,BorderLayout.SOUTH);
        c.add(b3,BorderLayout.EAST);
        c.add(b4,BorderLayout.CENTER);
        c.add(b5,BorderLayout.WEST);
        //bydefault it add to center
        //c.add(b1);


        jf.setVisible(true);
    }
}
