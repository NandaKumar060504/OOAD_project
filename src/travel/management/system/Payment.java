// package travel.management.system;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class Payment extends JFrame implements ActionListener {

//     JButton b1, b2;

//     Payment () {

//         this.setBounds(350, 150, 800, 600);
//         this.getContentPane().setBackground(Color.WHITE);
//         this.setLayout(null);

//         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/paytm.jpeg"));
//         Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
//         ImageIcon i3 = new ImageIcon(i2);
//         JLabel l = new JLabel(i3);
//         l.setBounds(0, 0, 800, 600);
//         this.add(l);

//         b1 = new JButton("Pay");
//         b1.setBounds(300, 0, 80, 40);
//         b1.addActionListener(this);
//         l.add(b1);

//         b2 = new JButton("Back");
//         b2.setBounds(450, 0, 80, 40);
//         b2.addActionListener(this);
//         l.add(b2);
//     }

//     public void actionPerformed (ActionEvent ae) {
//         if (ae.getSource() == b1) {
//             this.setVisible(false);
//             new Paytm().setVisible(true);
//         } else if (ae.getSource() == b2){
//             this.setVisible(false);
//         }
//     }

//     public static void main(String[] args) {
//         new Payment().setVisible(true);
//     }
// }

// package travel.management.system;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class Payment extends JFrame implements ActionListener {

//     JButton pay, back;
//     String hotelName;
//     String totalPrice;

//     // ✅ DEFAULT CONSTRUCTOR for Dashboard (required to avoid crash)
//     public Payment() {
//         this("Demo Hotel", "Rs. 9999"); // Call the parameterized constructor with sample data
//     }

//     // ✅ PARAMETERIZED CONSTRUCTOR for future dynamic usage
//     public Payment(String hotelName, String totalPrice) {
//         this.hotelName = hotelName;
//         this.totalPrice = totalPrice;

//         setBounds(300, 100, 800, 600);
//         setLayout(null);
//         getContentPane().setBackground(Color.WHITE);

//         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
//         Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
//         ImageIcon i3 = new ImageIcon(i2);
//         JLabel label = new JLabel(i3);
//         label.setBounds(0, 0, 800, 600);
//         add(label);

//         pay = new JButton("Pay");
//         pay.setBounds(300, 450, 100, 30);
//         pay.addActionListener(this);
//         label.add(pay);

//         back = new JButton("Back");
//         back.setBounds(450, 450, 100, 30);
//         back.addActionListener(this);
//         label.add(back);

//         JLabel info = new JLabel("Hotel: " + hotelName + " | Price: " + totalPrice);
//         info.setBounds(250, 400, 300, 30);
//         info.setForeground(Color.WHITE);
//         label.add(info);

//         setVisible(true);
//     }

//     public void actionPerformed(ActionEvent ae) {
//         if (ae.getSource() == pay) {
//             JOptionPane.showMessageDialog(null, "Payment Successful for " + hotelName + " (" + totalPrice + ")");
//             setVisible(false);
//         } else {
//             setVisible(false);
//         }
//     }
// }


package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener {

    JButton pay, back;
    String hotelName;
    String totalPrice;

    public Payment() {
        this("Demo Hotel", "Rs. 9999");
    }

    public Payment(String hotelName, String totalPrice) {
        this.hotelName = hotelName;
        this.totalPrice = totalPrice;

        setBounds(300, 100, 800, 600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // ✅ Fixed relative path for your folder structure
        ImageIcon i1 = new ImageIcon("travel/management/system/icons/paytm.jpeg");
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 800, 600);
        add(label);

        pay = new JButton("Pay");
        pay.setBounds(300, 450, 100, 30);
        pay.addActionListener(this);
        label.add(pay);

        back = new JButton("Back");
        back.setBounds(450, 450, 100, 30);
        back.addActionListener(this);
        label.add(back);

        JLabel info = new JLabel("Hotel: " + hotelName + " | Price: " + totalPrice);
        info.setBounds(250, 400, 300, 30);
        info.setForeground(Color.WHITE);
        label.add(info);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == pay) {
            setVisible(false);
            new Paytm(hotelName, totalPrice).setVisible(true);
        } else {
            setVisible(false);
        }
    }
}



