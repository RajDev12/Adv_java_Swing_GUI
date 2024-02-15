package GUI;

import javax.swing.*;
import java.awt.*;

public class CheckBox_Button {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setSize(800,600);
        jf.setLocation(100,100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=jf.getContentPane();
        jf.setLayout(null);

        JCheckBox ch1= new JCheckBox("High School");
        JCheckBox ch2= new JCheckBox("High School");
        JCheckBox ch3= new JCheckBox("High School");
        JCheckBox ch4= new JCheckBox("High School");
        JCheckBox ch5= new JCheckBox("High School");

        ch1.setBounds(100,100,250,50);
        ch2.setBounds(100,150,250,50);
        ch3.setBounds(100,200,250,50);
        ch4.setBounds(100,250,250,50);
        ch5.setBounds(100,300,250,50);

        Font f=new Font("Arial",Font.BOLD,35);
        ch1.setFont(f);
        ch2.setFont(f);
        ch3.setFont(f);
        ch4.setFont(f);
        ch5.setFont(f);

        c.add(ch1);
        c.add(ch2);
        c.add(ch3);
        c.add(ch4);
        c.add(ch5);



        jf.setVisible(true);
    }
}
