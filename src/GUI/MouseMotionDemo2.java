package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class MyFrame8 extends JFrame implements MouseMotionListener {
    JLabel lbl;
    JTextArea ta;
    Container c;
    Font f=new Font("Arial",Font.BOLD,35);

    MyFrame8(){
        setBounds(100,100,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mouse Motion");
        setLocationRelativeTo(null);
        c=getContentPane();
        c.setLayout(null);
        addMouseMotionListener(this);


        setVisible(true);


    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g=getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),50,60);

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

public class MouseMotionDemo2 {
    public static void main(String[] args) {
        new MyFrame8();
    }
}
