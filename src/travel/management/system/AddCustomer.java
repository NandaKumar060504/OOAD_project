
// package travel.management.system;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.sql.ResultSet;
// import java.sql.SQLException;

// public class AddCustomer extends JFrame implements ActionListener {

//     JTextField t1, t2, t3, t4, t5, t6, t7;
//     JComboBox<String> c1;
//     JRadioButton r1, r2;
//     ButtonGroup genderGroup;
//     JButton b1, b2;

//     AddCustomer(String username) {

//         setBounds(350, 150, 850, 550);
//         getContentPane().setBackground(Color.WHITE);
//         setLayout(null);

//         JLabel heading = new JLabel("ADD CUSTOMER DETAILS");
//         heading.setFont(new Font("Tahoma", Font.BOLD, 20));
//         heading.setBounds(50, 0, 300, 25);
//         add(heading);

//         JLabel l1 = new JLabel("Username : ");
//         l1.setBounds(30, 50, 150, 25);
//         add(l1);

//         t1 = new JTextField();
//         t1.setBounds(180, 50, 200, 25);
//         add(t1);

//         JLabel l2 = new JLabel("ID : ");
//         l2.setBounds(30, 90, 150, 25);
//         add(l2);

//         c1 = new JComboBox<>(new String[]{"Passport", "Voter ID Card", "Aadhaar Card", "Driving License", "PAN Card"});
//         c1.setBounds(180, 90, 200, 25);
//         add(c1);

//         JLabel l3 = new JLabel("ID Number : ");
//         l3.setBounds(30, 130, 150, 25);
//         add(l3);

//         t2 = new JTextField();
//         t2.setBounds(180, 130, 200, 25);
//         add(t2);

//         JLabel l4 = new JLabel("Name : ");
//         l4.setBounds(30, 170, 150, 25);
//         add(l4);

//         t3 = new JTextField();
//         t3.setBounds(180, 170, 200, 25);
//         add(t3);

//         JLabel l5 = new JLabel("Gender : ");
//         l5.setBounds(30, 210, 150, 25);
//         add(l5);

//         r1 = new JRadioButton("Male");
//         r1.setBackground(Color.WHITE);
//         r1.setBounds(180, 210, 70, 25);
//         add(r1);

//         r2 = new JRadioButton("Female");
//         r2.setBackground(Color.WHITE);
//         r2.setBounds(270, 210, 70, 25);
//         add(r2);

//         genderGroup = new ButtonGroup();
//         genderGroup.add(r1);
//         genderGroup.add(r2);

//         JLabel l6 = new JLabel("Country : ");
//         l6.setBounds(30, 250, 150, 25);
//         add(l6);

//         t4 = new JTextField();
//         t4.setBounds(180, 250, 200, 25);
//         add(t4);

//         JLabel l7 = new JLabel("Address : ");
//         l7.setBounds(30, 290, 150, 25);
//         add(l7);

//         t5 = new JTextField();
//         t5.setBounds(180, 290, 200, 25);
//         add(t5);

//         JLabel l8 = new JLabel("Phone : ");
//         l8.setBounds(30, 330, 150, 25);
//         add(l8);

//         t6 = new JTextField();
//         t6.setBounds(180, 330, 200, 25);
//         add(t6);

//         JLabel l9 = new JLabel("E-Mail : ");
//         l9.setBounds(30, 370, 150, 25);
//         add(l9);

//         t7 = new JTextField();
//         t7.setBounds(180, 370, 200, 25);
//         add(t7);

//         b1 = new JButton("Add");
//         b1.setBackground(Color.BLACK);
//         b1.setForeground(Color.WHITE);
//         b1.setBounds(70, 430, 100, 25);
//         b1.addActionListener(this);
//         add(b1);

//         b2 = new JButton("Back");
//         b2.setBackground(Color.BLACK);
//         b2.setForeground(Color.WHITE);
//         b2.setBounds(220, 430, 100, 25);
//         b2.addActionListener(this);
//         add(b2);

//         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/newcustomer.jpg"));
//         Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
//         ImageIcon i3 = new ImageIcon(i2);
//         JLabel l10 = new JLabel(i3);
//         l10.setBounds(400, 40, 450, 420);
//         add(l10);

//         // Auto-fill from `account` table
//         try {
//             Conn c = new Conn();
//             ResultSet rs = c.s.executeQuery("SELECT * FROM account WHERE username = '" + username + "'");
//             if (rs.next()) {
//                 t1.setText(rs.getString("username"));
//                 t3.setText(rs.getString("name"));
//             }
//         } catch (SQLException e) {
//             System.out.println("Something Went Wrong: " + e.getMessage());
//         }
//     }

//     public void actionPerformed(ActionEvent ae) {
//         String username = t1.getText();
//         String id = (String) c1.getSelectedItem();
//         String number = t2.getText();
//         String name = t3.getText();
//         String gender = r1.isSelected() ? "Male" : (r2.isSelected() ? "Female" : "");
//         String country = t4.getText();
//         String address = t5.getText();
//         String phone = t6.getText();
//         String email = t7.getText();

//         if (ae.getSource() == b1) {
//             String q = "INSERT INTO customer VALUES ('" + username + "', '" + id + "', '" + number + "', '" + name + "', '" + gender + "', '" +
//                     country + "', '" + address + "', '" + phone + "', '" + email + "')";
//             try {
//                 Conn c = new Conn();
//                 c.s.executeUpdate(q);
//                 JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
//                 setVisible(false);
//             } catch (SQLException e) {
//                 System.out.println("Something Went Wrong: " + e.getMessage());
//                 JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
//             }
//         } else if (ae.getSource() == b2) {
//             setVisible(false);
//         }
//     }

//     public static void main(String[] args) {
//         new AddCustomer("Anonymous").setVisible(true);
//     }
// }

package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddCustomer extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5, t6, t7;
    JComboBox<String> c1;
    JRadioButton r1, r2;
    ButtonGroup genderGroup;
    JButton b1, b2;

    AddCustomer(String username) {

        setBounds(350, 150, 850, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("ADD CUSTOMER DETAILS");
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading.setBounds(50, 0, 300, 25);
        add(heading);

        JLabel l1 = new JLabel("Username : ");
        l1.setBounds(30, 50, 150, 25);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(180, 50, 200, 25);
        add(t1);

        JLabel l2 = new JLabel("ID : ");
        l2.setBounds(30, 90, 150, 25);
        add(l2);

        c1 = new JComboBox<>(new String[]{"Passport", "Voter ID Card", "Aadhaar Card", "Driving License", "PAN Card"});
        c1.setBounds(180, 90, 200, 25);
        add(c1);

        JLabel l3 = new JLabel("ID Number : ");
        l3.setBounds(30, 130, 150, 25);
        add(l3);

        t2 = new JTextField();
        t2.setBounds(180, 130, 200, 25);
        add(t2);

        JLabel l4 = new JLabel("Name : ");
        l4.setBounds(30, 170, 150, 25);
        add(l4);

        t3 = new JTextField();
        t3.setBounds(180, 170, 200, 25);
        add(t3);

        JLabel l5 = new JLabel("Gender : ");
        l5.setBounds(30, 210, 150, 25);
        add(l5);

        r1 = new JRadioButton("Male");
        r1.setBackground(Color.WHITE);
        r1.setBounds(180, 210, 70, 25);
        add(r1);

        // Fixed Female radio button with more space
        r2 = new JRadioButton("Female");
        r2.setBackground(Color.WHITE);
        r2.setBounds(270, 210, 100, 25); // Increased width from 70 to 100
        add(r2);

        genderGroup = new ButtonGroup();
        genderGroup.add(r1);
        genderGroup.add(r2);

        JLabel l6 = new JLabel("Country : ");
        l6.setBounds(30, 250, 150, 25);
        add(l6);

        t4 = new JTextField();
        t4.setBounds(180, 250, 200, 25);
        add(t4);

        JLabel l7 = new JLabel("Address : ");
        l7.setBounds(30, 290, 150, 25);
        add(l7);

        t5 = new JTextField();
        t5.setBounds(180, 290, 200, 25);
        add(t5);

        JLabel l8 = new JLabel("Phone : ");
        l8.setBounds(30, 330, 150, 25);
        add(l8);

        t6 = new JTextField();
        t6.setBounds(180, 330, 200, 25);
        add(t6);

        JLabel l9 = new JLabel("E-Mail : ");
        l9.setBounds(30, 370, 150, 25);
        add(l9);

        t7 = new JTextField();
        t7.setBounds(180, 370, 200, 25);
        add(t7);

        // Fixed buttons with better styling - just making them visible
        // b1 = new JButton("Add");
        // b1.setBackground(Color.BLACK);
        // b1.setForeground(Color.WHITE);
        // b1.setFont(new Font("Tahoma", Font.BOLD, 14)); // Added font to make text more visible
        // b1.setBounds(70, 430, 100, 35); // Increased height for better visibility
        // b1.addActionListener(this);
        // add(b1);

        // b2 = new JButton("Back");
        // b2.setBackground(Color.BLACK);
        // b2.setForeground(Color.WHITE);
        // b2.setFont(new Font("Tahoma", Font.BOLD, 14)); // Added font to make text more visible
        // b2.setBounds(220, 430, 100, 35); // Increased height for better visibility
        // b2.addActionListener(this);
        // add(b2);
        // Replace your current button code with this
b1 = new JButton("Add");
b1.setBackground(Color.BLACK);
b1.setForeground(Color.WHITE);
b1.setFont(new Font("Tahoma", Font.BOLD, 14));
b1.setBounds(70, 430, 100, 35);
b1.setOpaque(true);
b1.setBorderPainted(false);
b1.setFocusPainted(false);
b1.addActionListener(this);
add(b1);

b2 = new JButton("Back");
b2.setBackground(Color.BLACK);
b2.setForeground(Color.WHITE);
b2.setFont(new Font("Tahoma", Font.BOLD, 14));
b2.setBounds(220, 430, 100, 35);
b2.setOpaque(true);
b2.setBorderPainted(false);
b2.setFocusPainted(false);
b2.addActionListener(this);
add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(400, 40, 450, 420);
        add(l10);

        // Auto-fill from `account` table
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM account WHERE username = '" + username + "'");
            if (rs.next()) {
                t1.setText(rs.getString("username"));
                t3.setText(rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println("Something Went Wrong: " + e.getMessage());
        }
    }

    public void actionPerformed(ActionEvent ae) {
        String username = t1.getText();
        String id = (String) c1.getSelectedItem();
        String number = t2.getText();
        String name = t3.getText();
        String gender = r1.isSelected() ? "Male" : (r2.isSelected() ? "Female" : "");
        String country = t4.getText();
        String address = t5.getText();
        String phone = t6.getText();
        String email = t7.getText();

        if (ae.getSource() == b1) {
            String q = "INSERT INTO customer VALUES ('" + username + "', '" + id + "', '" + number + "', '" + name + "', '" + gender + "', '" +
                    country + "', '" + address + "', '" + phone + "', '" + email + "')";
            try {
                Conn c = new Conn();
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
                setVisible(false);
            } catch (SQLException e) {
                System.out.println("Something Went Wrong: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        } else if (ae.getSource() == b2) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddCustomer("Anonymous").setVisible(true);
    }
}
