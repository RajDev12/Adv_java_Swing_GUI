package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_Action2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Button Action  2");
        jf.setBounds(400,400,800,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container csr=jf.getContentPane();
        jf.setLayout(null);
        jf.setVisible(true);

        //inititalising a instanse of a button.
        JButton btn_submit = new JButton("Submit");
        btn_submit.setBounds(100,100,200,50);
        csr.add(btn_submit);

        btn_submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                csr.setBackground(Color.red);

            }
        });


    }
}
