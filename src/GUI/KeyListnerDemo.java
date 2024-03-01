package GUI;

//Method
//1.KeyListner
//2.KeyPressed
//3.KeyTyped
//4.KeyReleased()
//5.addKeyListner() ->add

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MyFrame4 extends JFrame implements KeyListener {
    JTextArea ta;

    MyFrame4(){
        setTitle("Key Event Handling");
        setBounds(100,100,800,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);

        ta=new JTextArea();
        ta.setBounds(10,10,600,500);
        Font f=new Font("Arial",Font.BOLD,30);
        c.add(ta);
        ta.addKeyListener(this);


        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        ta.setText(ta.getText()+ "\n Key Typed :"+ e.getKeyChar());

    }

    @Override
    public void keyPressed(KeyEvent e) {
        ta.setText(ta.getText()+ "\n Key Pressed :" + e.getKeyChar());

    }

    @Override
    public void keyReleased(KeyEvent e) {
        ta.setText(ta.getText()+ "\nKey Realesed :"+ e.getKeyChar());

    }
}

public class KeyListnerDemo {
    public static void main(String[] args) {
        MyFrame4 f=new MyFrame4();
    }
}
