package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    Container c;
    JButton btn;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    MyFrame(){
        c=this.getContentPane();
        c.setLayout(null);
        btn=new JButton("Click ME");
        btn.setBounds(200,200,150,50);
        btn.setFont(new Font("Arial",Font.BOLD,22));
        c.add(btn);
        btn.addActionListener(this);

        btn1=new JButton("Green");
        btn1.setBounds(400,200,150,50);
        c.add(btn1);
        btn1.addActionListener(this);

        btn2=new JButton("RED");
        btn2.setBounds(600,200,150,50);
        c.add(btn2);
        btn2.addActionListener(this);

        btn3=new JButton("Yellow");
        btn3.setBounds(800,200,150,50);
        c.add(btn3);
        btn3.addActionListener(this);
    }

    //Overriding the interface abstract method to change the color on clicking the button
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn)
            c.setBackground(Color.BLUE);
        if(e.getSource()==btn1)
            c.setBackground(Color.green);
        if(e.getSource()==btn2)
            c.setBackground(Color.red);
        if(e.getSource()==btn3)
            c.setBackground(Color.yellow);



    }
}
public class Button_Action1 {
    public static void main(String[] args) {
    MyFrame f =new MyFrame();
    f.setTitle("Action on Button...");
    f.setVisible(true);



    }

}
