package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventListener;

class MyFrame3 extends JFrame implements ItemListener {
    @Override
    public void itemStateChanged(ItemEvent e) {
        ta.setText(cb.getSelectedItem().toString());
    }

    JComboBox cb;
    JTextArea ta;
    MyFrame3(){
        Container c=getContentPane();
        c.setLayout(null);

        Font f=new Font("Arial",35,Font.BOLD);
        String[] s ={"A","B","C","D"};
        cb=new JComboBox(s);
        cb.setFont(f);
        cb.setBounds(10,100,200,50);
        ta=new JTextArea(3,10);
        ta.setBounds(250,100,200,300);
        ta.setFont(f);
        c.add(ta);

        c.add(cb);


    }

}

public class ComboBooxEvent {
    public static void main(String[] args) {
        MyFrame3 f=new MyFrame3();
        f.setTitle("Item Event Handling");
        f.setBounds(100,100,600,500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        f.setVisible(true);
    }
}
