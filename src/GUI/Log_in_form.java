package GUI;

import javax.swing.*;
import java.awt.*;

public class Log_in_form {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setSize(800,600);
        jf.setLocation(100,100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=jf.getContentPane();
        jf.setLayout(null);

        //use label to show  text/content inside the window
        JLabel userlabel=new JLabel("User Name : ");
        userlabel.setBounds(100,100,200,50);
        //add the label to container for visibility
        c.add(userlabel);

        Font f =new Font("calibri",Font.BOLD,35);
        userlabel.setFont(f);

        JTextArea textarea=new JTextArea();
        textarea.setSize(200,50);
        textarea.setLocation(300,100);
        c.add(textarea);
        c.setBackground(Color.lightGray);
//        textarea.setBackground(Color.YELLOW);
        textarea.setFont(new Font("Verdana",Font.BOLD,30));
        textarea.setLineWrap(true);
        //textarea.setEnabled(false); //non editable textarea
        textarea.setText("Default text"); //to show default text

        JLabel passwordlabel=new JLabel("Password : ");
        passwordlabel.setBounds(100,200,200,50);
        passwordlabel.setFont(f);
        //add the label to container for visibility
        c.add(passwordlabel);

        JPasswordField pswd = new JPasswordField();
        pswd.setBounds(300,200,300,50);
        pswd.setFont(f);
        pswd.setText("123456");
        c.add(pswd);

        JLabel phonelabel=new JLabel("Phone No : ");
        phonelabel.setBounds(100,300,200,50);
        phonelabel.setFont(f);
        //add the label to container for visibility
        c.add(phonelabel);

        JTextArea phone=new JTextArea();
        phone.setSize(200,50);
        phone.setLocation(350,300);
        c.add(phone);
        c.setBackground(Color.lightGray);
//        textarea.setBackground(Color.YELLOW);
        phone.setFont(new Font("Verdana",Font.BOLD,30));
        //textarea.setEnabled(false); //non editable textarea
//        textarea.setText("+); //to show default text




        jf.setVisible(true);

    }
}
