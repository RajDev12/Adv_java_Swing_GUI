import javax.swing.*;
import java.awt.*;

public class Log_ing_form {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Button Action  2");
        jf.setBounds(400,400,800,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container csr=jf.getContentPane();
        jf.setLayout(null);


        //use label to show  text/content inside the window
        JLabel label=new JLabel("stringBuilder.User Name : ");
        label.setBounds(100,100,200,50);
        //add the label to container for visibility
        csr.add(label);
        Font f =new Font("calibri",Font.BOLD,30);
        label.setFont(f);

        JTextField jtxt=new JTextField();
        jtxt.setBounds(300,100,300,50);
//        jtxt.setText("Enter stringBuilder.User Name ....");
        csr.add(jtxt);
        jtxt.setFont(new Font("calibri",Font.BOLD,30));

        JLabel label2=new JLabel("Password : ");
        label2.setBounds(100,200,200,50);
        //add the label to container for visibility
        csr.add(label2);
        label2.setFont(f);

        JPasswordField pswd = new JPasswordField();
        pswd.setBounds(300,200,300,50);
        pswd.setFont(f);
        pswd.setText("123456");
        csr.add(pswd);

        JButton btn = new JButton("SUBMIT");      //creating instance of button
        btn.setSize(200,100);
        btn.setLocation(250,300);
        csr.add(btn);


        jf.setVisible(true);
    }
}
