package GUI;

import javax.swing.*;
import java.awt.*;

public class MyTextField {
    public static void main(String[] args) {
        JFrame jf =new JFrame("JFrame_demo03");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(500,300,800,600);
        Container contr =jf.getContentPane();
        contr.setLayout(null);

        JTextField jtxt=new JTextField();
        jtxt.setBounds(200,200,300,50);
        jtxt.setText("Enter User Name ....");
        contr.add(jtxt);
        Font f =new Font("Arial",Font.BOLD,30);
        jtxt.setFont(f);

        jtxt.setForeground(Color.BLUE);
        jtxt.setBackground(Color.RED);
        jtxt.setEditable(false);

        JPasswordField pswd = new JPasswordField();
        pswd.setBounds(200,300,300,50);
        pswd.setFont(f);
        pswd.setText("123456");
        contr.add(pswd);
        pswd.setEchoChar('5'); //typecaste to char   =  (char)0


        //JButton button = new JButton("Click Here"); //creating instance of button



        jf.setVisible(true);

    }
}
