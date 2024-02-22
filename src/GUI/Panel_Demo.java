package GUI;

import javax.swing.*;
import java.awt.*;

// Component
/*
        1. Heavy Weight Component - > can not added to other component

2.Light Weight COmponent-> can be added to other component
container -> it my conatin some other light weight component
JPanel->
1. it is Light weight compnent
2. It is also one type of Container
3. It can added with other component like-JButton, JLabel etc.class
*/
public class Panel_Demo {
    public static void main(String[] args) {

        JFrame jf = new JFrame("My JPanel Demo");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// jf.setBounds(100,100,800,600);
        jf.setSize(800,600);
        jf.setLocationRelativeTo(null);
        Container c=jf.getContentPane();
        c.setLayout(null);

        JPanel jp=new JPanel();
        jp.setBounds(100,100,200,200);
        c.add(jp);
        jp.setLayout(null);
        jp.setBackground(Color.BLUE);

        JPanel jp2=new JPanel();
        jp2.setBounds(50,50,200,200);
        jp.add(jp2);
        jp2.setLayout(null);
        jp2.setBackground(Color.YELLOW);

        JButton btn=new JButton("My Button");
        btn.setBounds(100,100,100,50);
        c.add(btn);
//jp2.add(btn);
        jf.setVisible(true);
    }
}





//package GUI;
//
//import javax.swing.*;
//import java.awt.*;
//
////Component
////1.Heavy weight Component=cant be added to other container
////2.lightweight component=can be added to other container,it may contain some other light weight component
////JPanel=1.a light weight component
//// 2.It id also a type of container whivh can be aded with jlabel,jframe ,jbutton.
//public class Panel_Demo {
//    public static void main(String[] args) {
//        JFrame jf=new JFrame("MY panel Demo");
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jf.setBounds(100,100,800,600);
//        jf.setLayout(null);
//        JPanel jp=new JPanel();
//        jp.setBounds(0,0,200,200);
//        Container c=jf.getContentPane();
//        c.add(jp);
//
//        jp.setBackground(Color.BLUE);
//
//        JPanel jp2=new JPanel();
//        jp2.setBounds(50,50,200,200);
//        jp.add(jp2);
//        jp2.setLayout(null);
//        jp2.setBackground(Color.yellow); //overlaaping with jp
//
//
//        JButton btn=new JButton("MY BUTTON");
//        btn.setBounds(100,100,100,50);
//        c.add(btn);
//
//
//
//
//
//
//        jf.setVisible(true);
//
//    }
//}
