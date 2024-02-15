package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame  implements ActionListener {

    Container c;
    JLabel label1,label2,labelResult;
    JTextField txt1, txt2;
    JButton add, sub, mul, div;

    Calculator(){
        setTitle("My Calculator");
        setBounds(100,100,800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=getContentPane();
        c.setLayout(null);
        //setting hte label

        Font f =new Font("Arial",Font.BOLD,30);
        label1 = new JLabel("First Number");
        label1.setBounds(50,50,150,50);
        label1.setFont(f);
        c.add(label1);
        label2 = new JLabel("Second Number");
        label2.setBounds(50,150,150,50);
        label1.setFont(f);
        c.add(label2);

        labelResult = new JLabel("Print Result");
        labelResult.setBounds(600,250,150,50);
        labelResult.setFont(f);
        labelResult.setBackground(Color.BLUE);
        c.add(labelResult);

        //setting -the text box
        txt1 =new JTextField();
        txt1.setBounds(250,50,150,50);
        txt1.setFont(f);
        c.add(txt1);

        txt2 =new JTextField(0);
        txt2.setBounds(250,150,150,50);
        txt2.setFont(f);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int x = Integer.parseInt(txt1.getText());
            int y = Integer.parseInt(txt2.getText());
            int z = 0;
            if (e.getSource() == add)
                z = x + y;
                labelResult.setText("Result:"+z);
            if (e.getSource() == sub)
                z = x - y;
            if (e.getSource() == mul)
                z = x * y;
            else
                z = x / y;

        }catch(NumberFormatException ee){
            labelResult.setText("enter numeric values only...");
        }
        catch(ArithmeticException ee){
            labelResult.setText("enter non zero value");
        }

    }
}
public class MyCalculator {
    public static  void main(String[] args){
        Calculator cl=new Calculator();


    }
}
