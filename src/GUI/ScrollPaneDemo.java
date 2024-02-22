package GUI;

import javax.swing.*;
import java.awt.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("Scroll Pane");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // jf.setBounds(100,100,800,600);
        jf.setSize(800,600);
        jf.setLocationRelativeTo(null);
        jf.setLayout(new FlowLayout());


        jf.setVisible(true);



        JTextArea jta=new JTextArea(10,8); //rows & column in text area
        jta.setFont(new Font("arial",Font.ITALIC,30));

        JScrollPane jsp=new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jta.setLineWrap(true);
        jf.add(jsp);


        String []item={"Tea","Coffe","Nodles","Burger","PIzza","Pizza","Somosa","French Fries","Momos","Coca cola"};
        JList<String> list=new JList<>(item);
        JScrollPane jsp1=new JScrollPane(list);
        jsp1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //jsp1.setHorizontalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jsp1.setBounds(200,100,300,200);
        jf.add(jsp1);

        jf.setVisible(true);

    }
}
