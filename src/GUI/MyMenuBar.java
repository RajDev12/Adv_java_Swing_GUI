package GUI;
//Menu Bar
//1. Menu Bar
//2.Menu
//3.Menu item
//every actionListner is a interface

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyFrame2 extends JFrame{
    JMenuBar menubar;
    JMenu file,edit;
    JMenuItem l1,l2,l3,l4,e1,e2,e3,e4,e5,e6,e7;
    JTextArea ta;
    MyFrame2(){
        JFrame jf=new JFrame("MenuDemo");
        jf.setSize(800,600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);

        //MenuBar
        menubar=new JMenuBar();
        //Menu
        file=new JMenu("File");
        //adding the menu to the menubar
        menubar.add(file);
        JMenuItem  l1=new JMenuItem("New");
        JMenuItem  l2=new JMenuItem("Open");
        JMenuItem  l3=new JMenuItem("Recent");
        JMenuItem  l4=new JMenuItem("save");
        //adding the Menu item with Menus
        file.add(l1);
        file.add(l2);
        file.add(l3);
        file.add(l4);

        JMenu edit=new JMenu("Edit");
        //MenuItem
        JMenuItem  e1=new JMenuItem("cut");
        JMenuItem  e2=new JMenuItem("copy");
        JMenuItem  e3=new JMenuItem("paste");
        JMenuItem  e4=new JMenuItem("delete");
        JMenuItem  e5=new JMenuItem("select all");
        JMenuItem  e6=new JMenuItem("Replace");
        JMenuItem  e7=new JMenuItem("Undo");
        edit.add(e1);
        edit.add(e2);
        edit.add(e3);
        edit.add(e4);
        edit.add(e5);
        edit.add(e6);
        edit.add(e7);
        //adding the menu to the menubar
        menubar.add(edit);
        //ways to create Submenu
//        file.add(edit); //under file menu edit will have submenu

        jf.setJMenuBar(menubar);

        JTextArea ta=new JTextArea(10,20);
        ta.setBounds(10,10,700,500);
        ta.setFont(new Font("Tahoma",Font.ITALIC,35));

    }
}

public class MyMenuBar implements ActionListener {

    public static void main(String[] args) {
        new MyFrame2();




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==l1){
            ta.setText("TEXt.....")
        }

    }
}
