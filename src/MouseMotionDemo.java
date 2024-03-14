import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class MyFrame7 extends JFrame implements MouseMotionListener {
    JLabel lbl;
    JTextArea ta;
    Container c;
    Font f=new Font("Arial",Font.BOLD,35);
    MyFrame7(){
        setBounds(100,100,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mouse Motion");
        setLocationRelativeTo(null);
        c=getContentPane();
        c.setLayout(null);


        lbl=new JLabel("Welcome to Mouse Motion");
        lbl.setBounds(100,100,500,50);
        lbl.setFont(f);

        //adding the mouse function to the label
        lbl.addMouseMotionListener(this);

        c.add(lbl);

        ta=new JTextArea();
        ta.setBounds(100,170,300,300);
        ta.setFont(f);
        c.add(ta);
        setVisible(true);

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        ta.setText(ta.getText()+"\nMouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        ta.setText(ta.getText()+"\nMouse MOved");

    }
}


public class MouseMotionDemo {
    public static void main(String[] args) {
        new MyFrame7();
    }
}
