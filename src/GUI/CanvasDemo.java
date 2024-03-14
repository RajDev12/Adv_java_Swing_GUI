package GUI;

import javax.swing.*;
import java.awt.*;

class MyFrame9 extends Canvas
{
    public void paint(Graphics g)
    {
        Font f=new Font("Arial",10,34);
        g.setFont(f);

        g.drawString("KE001",20,50);
        g.fillRect(100,100,50,60);
        g.fillOval(80,50,100,150);
        g.fill

    }
}
public class CanvasDemo {
    public static void main(String[] args) {
        MyFrame9 my=new MyFrame9();
        JFrame jf=new JFrame("Canvas");
        jf.setBounds(100,100,800,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);

        jf.add(my);
    }
}