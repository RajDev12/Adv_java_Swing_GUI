package GUI;

import javax.swing.*;
import java.awt.*;

public class My_Button {
    public static void main(String []args){
       JFrame jf=new JFrame("My Button Demo");
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setBounds(100,100,800,500);

       Container c=jf.getContentPane();
       c.setLayout(null);

       jf.setVisible(true);


       //Adding a image to our button from our local system
       ImageIcon icon =new ImageIcon("C:\\Users\\rjnat\\Downloads\\25387-5-submit-button-clipart.png");

       JButton btn = new JButton(icon);      //creating instance of button
       btn.setSize(200,100);
       btn.setLocation(100,100);
       c.add(btn);                                      //adding the  button in the frame

       //Setting the font type and text of the button
       btn.setFont(new Font ("Arial",Font.BOLD,24));
       btn.setText("My Button");
       //Setting the COLOR of the button
       btn.setBackground(Color.BLUE);
       btn.setForeground(Color.YELLOW);


        //Working with  WAIT Cursor
        Cursor csr= new Cursor(Cursor.WAIT_CURSOR);
        btn.setCursor(csr);

        //Working with  HAND Cursor
        Cursor csr1= new Cursor(Cursor.HAND_CURSOR);
        btn.setCursor(csr1);

        //Working with  Crosshair Cursor
        Cursor csr3= new Cursor(Cursor.CROSSHAIR_CURSOR);
        btn.setCursor(csr3);

        //Setting condition on pressing the button Eg= checking a checkbox then button will work
        btn.setEnabled(false);









    }
}
