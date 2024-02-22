package GUI;

import javax.swing.*;
import java.awt.*;

//Types of layout
//1.Null Layout-when the component position is defined by us
//2.border Layout-top,down,right,left
//3.flow layout-Arrange the component automatically
//4.Grid Layout-Matrix
//5.Gridbag Layout-like grid + but resizable
//6.Group Layout-Arrange group wise
//7.Box Layout-Box Type
//8.Card Layout-
public class FlowLayoutDemo {
    public static void main(String []args){
        JFrame jf=new JFrame("Flow Layout");
        jf.setBounds(100,100,1000,900);
        Container c=jf.getContentPane();
        c.setLayout(null);

        //FlowLayout
        FlowLayout fl=new FlowLayout();
//        FlowLayout fl=new FlowLayout(FlowLayout.LEFT,150,50);
        fl.setHgap(50);
        fl.setVgap(50);
        c.setLayout(fl);



        JButton btn1 =new JButton("Button 1  111111"); //button size is automatically control on the basis of length
        JButton btn2 =new JButton("Button 2");
        JButton btn3 =new JButton("Button 3");
        JButton btn4 =new JButton("Button 4");
        JButton btn5 =new JButton("Button 5");
        JButton btn6 =new JButton("Button 6");
        JButton btn7 =new JButton("Button 7");
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);
        c.add(btn7);


        jf.setVisible(true);

    }
}
