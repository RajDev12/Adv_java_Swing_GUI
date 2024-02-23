package GUI;

import javax.swing.*;
import java.awt.*;

public class Table_Demo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("Table Demo");
        jf.setSize(800,600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String data[][]={
                {"100","Lakshay", "22"},
                {"101","Puneeth","23"},
                {"102","Rahul","24"},
                {"103","Rahul","24"},
                {"104","Raj","24"}
        };
        String []col={"ROll No","Name","Age"};

        JTable jt =new JTable(data,col);
        jf.add(new JScrollPane(jt));
        jf.setFont(new Font("Arial",Font.BOLD,45));
        jt.setRowHeight(50);
        jf.setVisible(true);

    }
}
