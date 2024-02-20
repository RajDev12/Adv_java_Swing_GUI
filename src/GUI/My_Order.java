package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class My_Order {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setSize(800,600);
        jf.setLocation(100,100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=jf.getContentPane();
        jf.setLayout(null);
        int pizza=100;

        JCheckBox chkPizza= new JCheckBox("Pizza -100");
        JCheckBox chPaniPuri= new JCheckBox("PaniPuri-50");
        JCheckBox chkNoodles= new JCheckBox("Noodles-120");
        JCheckBox chkSamosa= new JCheckBox("Samosa-15");
        JCheckBox chkTea= new JCheckBox("Tea-10");

        //setting the location and the size of the
        chkPizza.setBounds(100,100,250,50);
        chPaniPuri.setBounds(100,150,250,50);
        chkNoodles.setBounds(100,200,250,50);
        chkSamosa.setBounds(100,250,250,50);
        chkTea.setBounds(100,300,250,50);

        //Making a instance oif the font class/
        Font f=new Font("Arial",Font.BOLD,35);
        chkPizza.setFont(f);
        chPaniPuri.setFont(f);
        chkNoodles.setFont(f);
        chkSamosa.setFont(f);
        chkTea.setFont(f);

        c.add(chkPizza);
        c.add(chPaniPuri);
        c.add(chkNoodles);
        c.add(chkSamosa);
        c.add(chkTea);

        JButton placeOrder =new JButton("Place Order");
        placeOrder.setBounds(200,400,200,100);
        jf.add(placeOrder);

        JLabel lblmenu=  new JLabel("Choose your item from Menu to place the order");
        lblmenu.setBounds(20,20,500,80);
        lblmenu.setFont(f);
        lblmenu.setForeground(Color.GREEN);
        c.add(lblmenu);

        JLabel lblamount=  new JLabel("Amount:");
        lblamount.setBounds(400,100,500,50);
        lblamount.setFont(f);
        lblamount.setForeground(Color.BLACK);
        c.add(lblamount);

//        JTextArea textarea=new JTextArea();
//        textarea.setSize(200,200);
//        textarea.setLocation(100,100);
//        c.add(textarea);
//        c.setBackground(Color.lightGray);
        //Anonymous method implementation
//        btnorder.addActiveListner(new ActionListener()){
//            @Override
//                    public  void actionPerformed(ActionEvent e){
//                int amount=0;
//                //only use else if when only one item should be selected, for all possible choosing selkection use if
//            if()
//            }
//        }








        jf.setVisible(true);
    }
}
