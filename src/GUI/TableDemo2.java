//package GUI;
//
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//
//public class TableDemo2 {
//    public static void main(String[] args) {
//        JFrame jf=new JFrame("Table Demo");
//        jf.setSize(800,600);
//        jf.setLocationRelativeTo(null);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        Object [][]data={
//                {100,"Lakshay", "22-Dec"},
//                {101,"Puneeth","23-Nov"},
//                {102,"Rahul","24-Dec"},
//                {103,"Rahul","24-Jan"},
//                {104,"Rik"," "},
//                {"yam"}, //fill left to right
//                {106," ","12-12-12"}
//        };
//        String []col={"ROll No","Name","Age"};
//        DefaultTableModel dtm=new DefaultTableModel(data,col);
//        JTable jt=new JTable(dtm);
//        jf.add(new JScrollPane(jt));
////        JTable jt =new JTable(data,col);
//        jt.setFont(new Font("Arial",Font.BOLD,45));
//        jt.setRowHeight(50);
////        jf.setVisible(true);
//        jf.validate();
//        jf.setVisible(true);
//
//    }
//}
