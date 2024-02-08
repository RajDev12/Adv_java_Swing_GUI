package GUI;

import javax.swing.*;
import java.awt.*;

public class MyLabel {
    public static void main(String[] args) {
        JFrame jf =new JFrame("Jframe_demo01");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(500,300,800,600);
        Container contr =jf.getContentPane();
        contr.setLayout(null);

        //use label to show  text/content inside the window
        JLabel label=new JLabel("User Name : ");
        label.setBounds(100,200,200,50);
        //add the label to container for visibility
        contr.add(label);

        Font f =new Font("calibri",Font.BOLD,35);
        label.setFont(f);

        ImageIcon img =new ImageIcon("C:/Users/rjnat/IdeaProjects/ADV JAVA/pngegg.png");
        contr.setBounds(100,200,img.getIconWidth(),img.getIconHeight());








        //to make frame  visible
        jf.setVisible(true);  //make it at the end

    }
}
