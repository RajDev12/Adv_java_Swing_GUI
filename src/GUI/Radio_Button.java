package GUI;

import javax.swing.*;
import java.awt.*;

public class Radio_Button {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setSize(800,600);
        jf.setLocation(100,100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=jf.getContentPane();
        jf.setLayout(null);
        Font f=new Font("Arial",Font.ITALIC,35);

        JRadioButton rdmale =new JRadioButton("Male");
        rdmale.setBounds(100,100,200,50);
        rdmale.setFont(f);
        c.add(rdmale);

        JRadioButton rdfemale =new JRadioButton("FeMale");
        rdfemale.setBounds(300,100,200,50);
        rdfemale.setFont(f);
        c.add(rdfemale);

        ButtonGroup gender=new ButtonGroup();
        gender.add(rdfemale);
        gender.add(rdmale);
        rdfemale.setSelected(true);
        //rdfemale.setEnabled(false); //disable and enable the default option

        //Making a radiobox for caste
        JLabel labelCaste = new JLabel("Caste");
        labelCaste.setBounds(200,250,150,50);
        labelCaste.setFont(f);
        c.add(labelCaste);

        JRadioButton general =new JRadioButton("General");
        general.setBounds(200,300,200,100);
        general.setFont(f);
        c.add(general);

        JRadioButton OBC=new JRadioButton("OBC");
        OBC.setBounds(300,300,200,100);
        OBC.setFont(f);
        c.add(OBC);

        JRadioButton SC =new JRadioButton("SC");
        SC.setBounds(400,300,200,100);
        SC.setFont(f);
        c.add(SC);

        JRadioButton ST =new JRadioButton("ST");
        ST.setBounds(500,300,200,100);
        ST.setFont(f);
        c.add(ST);

        JRadioButton Other =new JRadioButton("Other");
        Other.setBounds(600,300,200,100);
        Other.setFont(f);
        c.add(Other);











        jf.setVisible(true);

    }
}
