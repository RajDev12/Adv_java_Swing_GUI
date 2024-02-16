package GUI;

import javax.swing.*;
import java.awt.*;

import static java.awt.SystemColor.menu;

//combobox is the alternative for checkbox and radio button
//Combo boxes, also known as drop-down lists or drop-down menus, allow users to choose one option from a list that is displayed when the user clicks on the combo box.

public class ComboBox_Demo {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(700,900);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=jf.getContentPane();
        jf.setLayout(null);

        String []menu={"Pepsi","Coca","Mirinda","7-UP","Sprite"};
        JComboBox jcb=new JComboBox();
        jcb.addItem("Cpcunut");
        jcb.removeItem("");





        JButton btn = new JButton("Select Items");

        JComboBox drp=new JComboBox();

        String [] menuu={"",""};








        jf.setVisible(true);

    }
}
