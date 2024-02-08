package GUI;

import javax.swing.*;
import java.awt.*;

public class JFrame_Demo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("Demo of JFrame");
       // jf.setTitle("Demo of JFrame");

        //process doesnt terminate after closing the window
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jf.setSize(800,600);
        //to set the location of the 1st opening position
       // jf.setLocation(370,280);
        jf.setBounds(500,300,800,600);
        //with seBound we can specify both location and the size of the opening window/component
        jf.setLayout(null);
        jf.setTitle("Demo of JFrame");
        // Creating Button
//        JButton button = new JButton("Hello Java");

        //ImageIcon icon = new ImageIcon("C:\\Users\\rjnat\\IdeaProjects\\ADV JAVA\\pngegg.png");
        ImageIcon icon = new ImageIcon("C:/Users/rjnat/IdeaProjects/ADV JAVA/pngegg.png");
        jf.setIconImage(icon.getImage());

        Container contr =jf.getContentPane();
        //contr.setLayout(null);
        //contr.setBackground(Color.BLUE;

        jf.setResizable(false); //so that user cant change the window size
        //to make frame  visible
        jf.setVisible(true);  //make it at the end



    }
}
