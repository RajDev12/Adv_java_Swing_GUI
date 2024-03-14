//package GUI;
//
//import javax.smartcardio.Card;
//import javax.swing.*;
//import java.awt.*;
//
////Only one/top card of deck will be shown
/////use next,previous, first and last method to show others
//public class Card_Layout {
//    public static void main(String[] args) {
//        JFrame jf=new JFrame("Card Layout Demo");
//        jf.setBounds(100,100,800,600);
//        jf.setLocationRelativeTo(null);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        Container c=jf.getContentPane();
//
//        CardLayout crd=new CardLayout();
//        c.setLayout(crd);
////        c.setLayout( new CardLayout());
//
//
//        JButton b1=new JButton("Page 1");
//        JButton b2=new JButton("Page 2");
//        JButton b3=new JButton("Page 3");
//        JButton b4=new JButton("Page 4");
//        JButton b5=new JButton("Page 5");
//        JButton b6=new JButton("Page 6");
//        Font f=new Font("Arial",35,Font.BOLD);
//        b1.setFont(f);
//        b2.setFont(f);
//        b3.setFont(f);
//        b4.setFont(f);
//        b5.setFont(f);
//        b6.setFont(f);
//
//        c.add(b1,"1");
//        c.add(b2,"2");
//        c.add(b3,"3");
//        c.add(b4,"4");
//        c.add(b5,"5");
//        c.add(b6,"6");
//
//        //Last Card
////        crd.last(c);
////        crd.previous(c);
////        crd.first(c);
////        crd.next(c);
//        crd.show(c,"4");
//
//
//        jf.setVisible(true);
//    }
//}
