// package travel.management.system;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.sql.ResultSet;
// import java.sql.SQLException;

// public class ViewPackage extends JFrame implements ActionListener {

//     JButton b;

//     ViewPackage (String username) {

//         this.setBounds(350, 150, 900, 450);
//         this.getContentPane().setBackground(Color.WHITE);
//         this.setLayout(null);

//         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/booKedDetails.jpg"));
//         Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
//         ImageIcon i3 = new ImageIcon(i2);
//         JLabel l8 = new JLabel(i3);
//         l8.setBounds(450, 20, 500, 400);
//         this.add(l8);

//         JLabel heading = new JLabel("VIEW PACKAGE DETAILS");
//         heading.setBounds(60, 0, 300, 30);
//         heading.setFont(new Font("Tahoma", Font.BOLD, 20));
//         this.add(heading);

//         JLabel l1 = new JLabel("Username: ");
//         l1.setBounds(30, 50, 100, 30);
//         this.add(l1);

//         JLabel l11 = new JLabel();
//         l11.setBounds(250, 50, 200, 30);
//         this.add(l11);

//         JLabel l2 = new JLabel("Package: ");
//         l2.setBounds(30, 90, 100, 30);
//         this.add(l2);

//         JLabel l12 = new JLabel();
//         l12.setBounds(250, 90, 200, 30);
//         this.add(l12);

//         JLabel l3 = new JLabel("Total Persons: ");
//         l3.setBounds(30, 130, 100, 30);
//         this.add(l3);

//         JLabel l13 = new JLabel();
//         l13.setBounds(250, 130, 200, 30);
//         this.add(l13);

//         JLabel l4 = new JLabel("ID: ");
//         l4.setBounds(30, 170, 100, 30);
//         this.add(l4);

//         JLabel l14 = new JLabel();
//         l14.setBounds(250, 170, 200, 30);
//         this.add(l14);

//         JLabel l5 = new JLabel("Number: ");
//         l5.setBounds(30, 210, 100, 30);
//         this.add(l5);

//         JLabel l15 = new JLabel();
//         l15.setBounds(250, 210, 200, 30);
//         this.add(l15);

//         JLabel l6 = new JLabel("Phone: ");
//         l6.setBounds(30, 250, 100, 30);
//         this.add(l6);

//         JLabel l16 = new JLabel();
//         l16.setBounds(250, 250, 200, 30);
//         this.add(l16);

//         JLabel l7 = new JLabel("Price: ");
//         l7.setBounds(30, 290, 100, 30);
//         this.add(l7);

//         JLabel l17 = new JLabel();
//         l17.setBounds(250, 290, 200, 30);
//         this.add(l17);

//         try {

//             Conn c = new Conn();
//             ResultSet rs = c.s.executeQuery("SELECT * FROM bookedPackage WHERE username = '"+username+"'");

//             while (rs.next()) {
//                 l11.setText(rs.getString(1));
//                 l12.setText(rs.getString(2));
//                 l13.setText(rs.getString(3));
//                 l14.setText(rs.getString(4));
//                 l15.setText(rs.getString(5));
//                 l16.setText(rs.getString(6));
//                 l17.setText(rs.getString(7));
//             }
//         } catch (SQLException e)  {
//             e.getMessage();
//         }

//         b = new JButton("Back");
//         b.setBackground(Color.BLACK);
//         b.setForeground(Color.WHITE);
//         b.setBounds(130, 360, 100, 25);
//         b.addActionListener(this);
//         this.add(b);
//     }

//     public void actionPerformed (ActionEvent ae) {
//         this.setVisible(false);
//     }

//     public static void main(String[] args) {
//         new ViewPackage("Anonymous").setVisible(true);
//     }
// }

// package travel.management.system;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.sql.ResultSet;
// import java.sql.SQLException;

// public class ViewPackage extends JFrame implements ActionListener {

//     JButton backButton;

//     ViewPackage(String username) {
//         this.setBounds(350, 150, 900, 450);
//         this.getContentPane().setBackground(Color.WHITE);
//         this.setLayout(null);

//         // Add image
//         ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/booKedDetails.jpg"));
//         Image scaledImage = imageIcon.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
//         ImageIcon scaledIcon = new ImageIcon(scaledImage);
//         JLabel imageLabel = new JLabel(scaledIcon);
//         imageLabel.setBounds(450, 20, 500, 400);
//         this.add(imageLabel);

//         // Heading
//         JLabel heading = new JLabel("VIEW PACKAGE DETAILS");
//         heading.setBounds(60, 0, 300, 30);
//         heading.setFont(new Font("Tahoma", Font.BOLD, 20));
//         this.add(heading);

//         // Create labels for all fields
//         JLabel[] labels = new JLabel[7];
//         String[] labelTexts = {"Username:", "Package:", "Total Persons:", "ID:", "Number:", "Phone:", "Price:"};
//         JLabel[] valueLabels = new JLabel[7];

//         // Position and add labels to the frame
//         for (int i = 0; i < labels.length; i++) {
//             labels[i] = new JLabel(labelTexts[i]);
//             labels[i].setBounds(30, 50 + (i * 40), 100, 30);
//             this.add(labels[i]);

//             valueLabels[i] = new JLabel();
//             valueLabels[i].setBounds(250, 50 + (i * 40), 200, 30);
//             this.add(valueLabels[i]);
//         }

//         try {
//             Conn c = new Conn();
//             // Changed from bookedPackage to bookPackage to match BookPackage class
//             ResultSet rs = c.s.executeQuery("SELECT * FROM bookPackage WHERE username = '" + username + "'");

//             if (rs.next()) {
//                 for (int i = 0; i < valueLabels.length; i++) {
//                     valueLabels[i].setText(rs.getString(i + 1));
//                 }
//             } else {
//                 JOptionPane.showMessageDialog(this, "No package found for this user");
//             }
//         } catch (SQLException e) {
//             JOptionPane.showMessageDialog(this, "Error loading package details: " + e.getMessage());
//             e.printStackTrace();
//         }

//         // Back button
//         backButton = new JButton("Back");
//         backButton.setBackground(Color.BLACK);
//         backButton.setForeground(Color.WHITE);
//         backButton.setBounds(130, 360, 100, 25);
//         backButton.addActionListener(this);
//         this.add(backButton);
//     }

//     @Override
//     public void actionPerformed(ActionEvent ae) {
//         this.setVisible(false);
//     }

//     public static void main(String[] args) {
//         new ViewPackage("Anonymous").setVisible(true);
//     }
// }

package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewPackage extends JFrame implements ActionListener {

    JButton b;

    ViewPackage(String username) {
        this.setBounds(350, 150, 900, 450);
        this.getContentPane().setBackground(Color.WHITE);
        this.setLayout(null);

        // Add image
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/booKedDetails.jpg"));
        Image scaledImage = imageIcon.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setBounds(450, 20, 500, 400);
        this.add(imageLabel);

        // Heading
        JLabel heading = new JLabel("VIEW PACKAGE DETAILS");
        heading.setBounds(60, 0, 300, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(heading);

        // Create labels for all fields
        JLabel[] labels = new JLabel[7];
        String[] labelTexts = {"Username:", "Package:", "Total Persons:", "ID:", "Number:", "Phone:", "Price:"};
        JLabel[] valueLabels = new JLabel[7];

        // Position and add labels to the frame
        for (int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel(labelTexts[i]);
            labels[i].setBounds(30, 50 + (i * 40), 100, 30);
            this.add(labels[i]);

            valueLabels[i] = new JLabel();
            valueLabels[i].setBounds(250, 50 + (i * 40), 200, 30);
            this.add(valueLabels[i]);
        }

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM bookPackage WHERE username = '" + username + "'");

            if (rs.next()) {
                for (int i = 0; i < valueLabels.length; i++) {
                    valueLabels[i].setText(rs.getString(i + 1));
                }
            } else {
                JOptionPane.showMessageDialog(this, "No package found for this user");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading package details: " + e.getMessage());
            e.printStackTrace();
        }

        // Back button in the requested format
        b = new JButton("Back");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(350, 350, 100, 25);
        b.setOpaque(true);          // Make the button opaque
        b.setBorderPainted(false);  // Remove default border
        b.setFocusPainted(false);   // Remove focus painting
        b.addActionListener(this);
        this.add(b);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new ViewPackage("Anonymous").setVisible(true);
    }
}