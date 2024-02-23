package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class MyFrame1 extends JFrame{
    JTextField ta;
    Container c;
    MyFrame1(){
        setSize(800,600);
        c=getContentPane();
        c.setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ta=new JTextField();
        ta.setBounds(100,100,200,50);
        ta.setFont(new Font("arial",Font.ITALIC,30));
        c.add(ta);

        ta.addActionListener(this);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        ta.setText(ta.getText().toUpperCase());
    }
}

public class TextField_Listner {
    public static void main(String[] args) {
        new MyFrame2();

    }
}
