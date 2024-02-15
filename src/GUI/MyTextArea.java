package GUI;

import javax.swing.*;
import java.awt.*;

public class MyTextArea {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setSize(800,600);
        jf.setLocation(100,100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=jf.getContentPane();
        jf.setLayout(null);

        JTextArea textarea=new JTextArea();
        textarea.setSize(200,200);
        textarea.setLocation(100,100);
        c.add(textarea);
        c.setBackground(Color.lightGray);
        textarea.setBackground(Color.YELLOW);
        textarea.setFont(new Font("Verdana",Font.BOLD,30));
        textarea.setLineWrap(true);
        //textarea.setEnabled(false); //non editable textarea
        textarea.setText("Default text"); //to show default text





        jf.setVisible(true);

    }
}
