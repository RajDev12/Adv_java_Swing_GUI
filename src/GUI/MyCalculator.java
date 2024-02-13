package GUI;

import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame{
    Container c;
    JLabel label1,label2;
    JTextField txt1, txt2;
    JButton add, sub, mul, div;

    Calculator(){
        setTitle("My Calculator");
        setBounds(100,100,800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=getContentPane();
        c.setLayout(null);
        //setting hte label
        label1 = new JLabel("First Number");
        label1.setBounds(50,50,150,50);
        c.add(label1);
        label2 = new JLabel("Second Number");
        label2.setBounds(50,150,150,50);
        c.add(label2);

        //setting -the text box
        txt1 =new JTextField();
        txt1.setBounds(250,50,150,50);
        c.add(txt1);

        txt2 =new JTextField(0);
        txt2.setBounds(250,150,150,50);
        c.add(txt2);

        add=new JButton("+");
        add.setBounds(150,250,100,50);
        c.add(add);
        sub=new JButton("-");
        sub.setBounds(300,250,100,50);
        c.add(sub);
        mul=new JButton("*");
        mul.setBounds(450,250,100,50);
        c.add(mul);
        div=new JButton("/");
        div.setBounds(600,250,100,50);
        c.add(div);



        setVisible(true);

    }
}
public class MyCalculator {
    public static  void main(String[] args){
        Calculator cl=new Calculator();


    }
}
