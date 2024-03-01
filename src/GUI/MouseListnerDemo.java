package GUI;

//Interface -MouseListner Methods===
//1.mouseEntered
//2.mouseExited
//3.mousePressed
//mouseClicked
//mouseReleased
//addMouseListner


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrame5 extends JFrame implements MouseListener {
    JTextArea ta;
    JLabel label;

    MyFrame5() {
        setTitle("Mouse Event Handling");
        setBounds(100, 100, 800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        ta = new JTextArea();
        ta.setBounds(100,200, 200, 400);
        ta.setLineWrap(true);
        Font f = new Font("Arial", Font.BOLD, 30);
        c.add(ta);

        label=new JLabel("Mouse Area");
        label.setBounds(20,20,200,200);
        label.setFont(f);
        c.add(label);
        //adding mouseListner to label, clicking,hover,released on label
        label.addMouseListener(this);



        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        ta.setText(ta.getText()+ "Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        ta.setText(ta.getText()+ "Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        ta.setText(ta.getText()+ "Mouse Released");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setForeground(Color.RED);
        ta.setBackground(Color.BLUE);
        ta.setText("Mouse Entered into label area");

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

public class MouseListnerDemo {
    public static void main(String[] args) {
        MyFrame5 f=new MyFrame5();

    }
}

