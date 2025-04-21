// package travel.management.system;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.sql.ResultSet;
// import java.sql.SQLException;

// public class BookPackage extends JFrame implements ActionListener {

//     Choice c1;
//     JLabel l11, l12, l13, l14, l15;
//     JTextField t1;
//     JButton b1, b2, b3;

//     BookPackage (String username) {

//         this.setBounds(300, 150, 1100, 500);
//         this.getContentPane().setBackground(Color.WHITE);
//         this.setLayout(null);

//         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookpackage.jpg"));
//         Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
//         ImageIcon i3 = new ImageIcon(i2);
//         JLabel l16= new JLabel(i3);
//         l16.setBounds(550, 50, 500, 300);
//         this.add(l16);

//         JLabel l1 = new JLabel("BOOK PACKAGE");
//         l1.setFont(new Font("Yu Mincho", Font.BOLD, 20));
//         l1.setBounds(100, 10, 200, 30);
//         this.add(l1);

//         JLabel l2 = new JLabel("Username: ");
//         l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
//         l2.setBounds(40, 70, 100, 30);
//         this.add(l2);

//         l11 = new JLabel();
//         l11.setFont(new Font("Tahoma", Font.PLAIN, 16));
//         l11.setBounds(250, 70, 250, 30);
//         this.add(l11);

//         JLabel l3 = new JLabel("Select Package: ");
//         l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
//         l3.setBounds(40, 110, 150, 30);
//         this.add(l3);

//         c1 = new Choice();
//         c1.add("Gold Package");
//         c1.add("Silver Package");
//         c1.add("Bronze Package");
//         c1.setBounds(250, 110, 250, 30);
//         this.add(c1);

//         JLabel l4 = new JLabel("Total Persons: ");
//         l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
//         l4.setBounds(40, 150, 150, 30);
//         this.add(l4);

//         t1 = new JTextField("1");
//         t1.setBounds(250, 150, 200, 25);
//         this.add(t1);

//         JLabel l5 = new JLabel("ID: ");
//         l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
//         l5.setBounds(40, 190, 100, 30);
//         this.add(l5);

//         l12 = new JLabel();
//         l12.setFont(new Font("Tahoma", Font.PLAIN, 16));
//         l12.setBounds(250, 190, 250, 30);
//         this.add(l12);

//         JLabel l6 = new JLabel("Number: ");
//         l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
//         l6.setBounds(40, 230, 100, 30);
//         this.add(l6);

//         l13 = new JLabel();
//         l13.setFont(new Font("Tahoma", Font.PLAIN, 16));
//         l13.setBounds(250, 230, 250, 30);
//         this.add(l13);

//         JLabel l7 = new JLabel("Phone: ");
//         l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
//         l7.setBounds(40, 270, 100, 30);
//         this.add(l7);

//         l14 = new JLabel();
//         l14.setFont(new Font("Tahoma", Font.PLAIN, 16));
//         l14.setBounds(250, 270, 250, 30);
//         this.add(l14);

//         JLabel l8 = new JLabel("Total Price: ");
//         l8.setFont(new Font("Tahoma", Font.PLAIN, 16));
//         l8.setBounds(40, 310, 100, 30);
//         this.add(l8);

//         l15 = new JLabel();
//         l15.setFont(new Font("Tahoma", Font.PLAIN, 16));
//         l15.setForeground(Color.RED);
//         l15.setBounds(250, 310, 250, 30);
//         this.add(l15);

//         try {
//             Conn c = new Conn();
//             ResultSet rs = c.s.executeQuery("SELECT * FROM customer WHERE username = '"+username+"'");
//             while (rs.next()) {
//                 l11.setText(rs.getString("username"));
//                 l12.setText(rs.getString("id"));
//                 l11.setText(rs.getString("number"));
//                 l11.setText(rs.getString("phone"));
//             }

//         } catch (SQLException e) {
//             e.getMessage();
//         }

//         b1 = new JButton("Check Price");
//         b1.setBackground(Color.BLACK);
//         b1.setForeground(Color.WHITE);
//         b1.setBounds(60, 380, 120, 25);
//         b1.addActionListener(this);
//         this.add(b1);

//         b2 = new JButton("Book Package");
//         b2.setBackground(Color.BLACK);
//         b2.setForeground(Color.WHITE);
//         b2.setBounds(200, 380, 120, 25);
//         b2.addActionListener(this);
//         this.add(b2);

//         b3 = new JButton("Back");
//         b3.setBackground(Color.BLACK);
//         b3.setForeground(Color.WHITE);
//         b3.setBounds(340, 380, 120, 25);
//         b3.addActionListener(this);
//         this.add(b3);
//     }

//     public void actionPerformed (ActionEvent ae) {
//         if (ae.getSource() == b1) {

//             String p = c1.getSelectedItem();

//             int price  = 0;

//             if (p.equals("Gold Package")) {
//                 price += 12000;
//             } else if (p.equals("Silver Package")) {
//                 price += 25000;
//             } else if (p.equals("Bronze Package")) {
//                 price += 32000;
//             }

//             int persons = Integer.parseInt(t1.getText());
//             price *= persons;

//             l15.setText("Rs. " + price);

//         } else if (ae.getSource() == b2) {
//             try {
//                 Conn c = new Conn();
//                 c.s.executeUpdate("INSERT INTO bookPackage values ('"+l11.getText()+"', '"+c1.getSelectedItem()+"'," +
//                         "'"+t1.getText()+"', '"+l12.getText()+"', '"+l13.getText()+"', '"+l14.getText()+"'," +
//                         "'"+l15.getText()+"')");
//                 JOptionPane.showMessageDialog(null, "Package Booked Successfully");
//                 this.setVisible(false);

//             } catch (SQLException e) {
//                 e.getMessage();
//             }
//         } else if (ae.getSource() == b3) {
//             this.setVisible(false);
//         }
//     }

//     public static void main(String[] args) {
//         new BookPackage("Anonymous").setVisible(true);
//     }
// }

package travel.management.system;


import travel.management.system.Payment;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * BookPackage class for booking travel packages in the travel management system
 */
public class BookPackage extends JFrame implements ActionListener {

    private Choice packageChoice;
    private JLabel usernameLabel, idLabel, numberLabel, phoneLabel, totalPriceLabel;
    private JTextField personsField;
    private JButton checkPriceButton, bookPackageButton, backButton;
    private String username;

    /**
     * Constructor for the BookPackage class
     * @param username The username of the customer booking the package
     */
    public BookPackage(String username) {
        this.username = username;
        
        // Set up frame properties
        setBounds(300, 150, 1100, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("Book Travel Package");

        // Create bookPackage table if it doesn't exist
        ensureTableExists();

        // Add banner image
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookpackage.jpg"));
        Image scaledImage = imageIcon.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setBounds(550, 50, 500, 300);
        add(imageLabel);

        // Create UI components
        createHeaderLabel();
        createUserInfoFields();
        createPackageSelectionFields();
        createButtons();
        
        // Load user data
        loadUserData();
    }
    /**
 * Books the selected package and opens the payment screen
 */




    /**
     * Ensures that the bookPackage table exists in the database
     */
    private void ensureTableExists() {
        try {
            Conn c = new Conn();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS bookPackage (" +
                "username VARCHAR(30), " +
                "package VARCHAR(30), " +
                "persons VARCHAR(10), " +
                "id VARCHAR(30), " +
                "number VARCHAR(30), " +
                "phone VARCHAR(20), " +
                "price VARCHAR(20)" +
                ")";
            c.s.executeUpdate(createTableSQL);
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error setting up database: " + e.getMessage());
        }
    }

    /**
     * Creates the header label for the form
     */
    private void createHeaderLabel() {
        JLabel headerLabel = new JLabel("BOOK PACKAGE");
        headerLabel.setFont(new Font("Yu Mincho", Font.BOLD, 20));
        headerLabel.setBounds(100, 10, 200, 30);
        add(headerLabel);
    }

    /**
     * Creates the user information fields
     */
    private void createUserInfoFields() {
        // Username field
        JLabel usernameText = new JLabel("Username: ");
        usernameText.setFont(new Font("Tahoma", Font.PLAIN, 16));
        usernameText.setBounds(40, 70, 100, 30);
        add(usernameText);

        usernameLabel = new JLabel();
        usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        usernameLabel.setBounds(250, 70, 250, 30);
        add(usernameLabel);

        // ID field
        JLabel idText = new JLabel("ID: ");
        idText.setFont(new Font("Tahoma", Font.PLAIN, 16));
        idText.setBounds(40, 190, 100, 30);
        add(idText);

        idLabel = new JLabel();
        idLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        idLabel.setBounds(250, 190, 250, 30);
        add(idLabel);

        // Number field
        JLabel numberText = new JLabel("Number: ");
        numberText.setFont(new Font("Tahoma", Font.PLAIN, 16));
        numberText.setBounds(40, 230, 100, 30);
        add(numberText);

        numberLabel = new JLabel();
        numberLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        numberLabel.setBounds(250, 230, 250, 30);
        add(numberLabel);

        // Phone field
        JLabel phoneText = new JLabel("Phone: ");
        phoneText.setFont(new Font("Tahoma", Font.PLAIN, 16));
        phoneText.setBounds(40, 270, 100, 30);
        add(phoneText);

        phoneLabel = new JLabel();
        phoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        phoneLabel.setBounds(250, 270, 250, 30);
        add(phoneLabel);

        // Total Price field
        JLabel priceText = new JLabel("Total Price: ");
        priceText.setFont(new Font("Tahoma", Font.PLAIN, 16));
        priceText.setBounds(40, 310, 100, 30);
        add(priceText);

        totalPriceLabel = new JLabel();
        totalPriceLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        totalPriceLabel.setForeground(Color.RED);
        totalPriceLabel.setBounds(250, 310, 250, 30);
        add(totalPriceLabel);
    }

    /**
     * Creates the package selection fields
     */
    private void createPackageSelectionFields() {
        // Package selection
        JLabel packageText = new JLabel("Select Package: ");
        packageText.setFont(new Font("Tahoma", Font.PLAIN, 16));
        packageText.setBounds(40, 110, 150, 30);
        add(packageText);

        packageChoice = new Choice();
        packageChoice.add("Gold Package");
        packageChoice.add("Silver Package");
        packageChoice.add("Bronze Package");
        packageChoice.setBounds(250, 110, 250, 30);
        add(packageChoice);

        // Persons field
        JLabel personsText = new JLabel("Total Persons: ");
        personsText.setFont(new Font("Tahoma", Font.PLAIN, 16));
        personsText.setBounds(40, 150, 150, 30);
        add(personsText);

        personsField = new JTextField("1");
        personsField.setBounds(250, 150, 200, 25);
        add(personsField);
    }

    /**
     * Creates the action buttons
     */
    private void createButtons() {
        // Check Price button
        checkPriceButton = new JButton("Check Price");
        checkPriceButton.setBackground(Color.BLACK);
        checkPriceButton.setForeground(Color.WHITE);
        checkPriceButton.setBounds(60, 380, 120, 25);
        checkPriceButton.addActionListener(this);
        checkPriceButton.setOpaque(true);  // Make button visible
        checkPriceButton.setBorderPainted(false);
        add(checkPriceButton);

        // Book Package button
        bookPackageButton = new JButton("Book Package");
        bookPackageButton.setBackground(Color.BLACK);
        bookPackageButton.setForeground(Color.WHITE);
        bookPackageButton.setBounds(200, 380, 120, 25);
        bookPackageButton.addActionListener(this);
        bookPackageButton.setOpaque(true);  // Make button visible
        bookPackageButton.setBorderPainted(false);
        add(bookPackageButton);

        // Back button
        backButton = new JButton("Back");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setBounds(340, 380, 120, 25);
        backButton.addActionListener(this);
        backButton.setOpaque(true);  // Make button visible
        backButton.setBorderPainted(false);
        add(backButton);
    }

    /**
     * Loads user data from the database
     */
    private void loadUserData() {
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM customer WHERE username = '" + username + "'");
            
            if (rs.next()) {
                usernameLabel.setText(rs.getString("username"));
                idLabel.setText(rs.getString("id"));
                numberLabel.setText(rs.getString("number"));
                phoneLabel.setText(rs.getString("phone"));
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error loading user data: " + e.getMessage());
        }
    }

    /**
     * Calculates the package price based on selected package and number of persons
     * @return the calculated price
     */
    private int calculatePrice() {
        String selectedPackage = packageChoice.getSelectedItem();
        int basePrice = 0;
        
        if (selectedPackage.equals("Gold Package")) {
            basePrice = 12000;
        } else if (selectedPackage.equals("Silver Package")) {
            basePrice = 25000;
        } else if (selectedPackage.equals("Bronze Package")) {
            basePrice = 32000;
        }
        
        int persons = 1;
        try {
            persons = Integer.parseInt(personsField.getText());
            if (persons < 1) {
                JOptionPane.showMessageDialog(this, "Number of persons must be at least 1");
                persons = 1;
                personsField.setText("1");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for persons");
            personsField.setText("1");
        }
        
        return basePrice * persons;
    }

    /**
     * Books the selected package
     */
    private void bookPackage() {
        try {
            Conn c = new Conn();
            
            // Make sure price is calculated
            if (totalPriceLabel.getText().isEmpty()) {
                int price = calculatePrice();
                totalPriceLabel.setText("Rs. " + price);
            }
            
            // Execute SQL
            String query = "INSERT INTO bookPackage VALUES ('" + 
                usernameLabel.getText() + "', '" + 
                packageChoice.getSelectedItem() + "', '" + 
                personsField.getText() + "', '" + 
                idLabel.getText() + "', '" + 
                numberLabel.getText() + "', '" + 
                phoneLabel.getText() + "', '" + 
                totalPriceLabel.getText() + "')";
                
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Package Booked Successfully");
            this.setVisible(false);
            
        } catch (SQLException e) {
            System.out.println("Booking error: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error booking package: " + e.getMessage());
        }
    }




    /**
     * Handles button click events
     * @param ae The action event
     */
    @Override
    // public void actionPerformed(ActionEvent ae) {
    //     if (ae.getSource() == checkPriceButton) {
    //         int price = calculatePrice();
    //         totalPriceLabel.setText("Rs. " + price);
            
    //     } else if (ae.getSource() == bookPackageButton) {
    //         bookPackage();
            
    //     } else if (ae.getSource() == backButton) {
    //         this.setVisible(false);
    //     }
    // }

public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == checkPriceButton) {
        int price = calculatePrice();
        totalPriceLabel.setText("Rs. " + price);

    } else if (ae.getSource() == bookPackageButton) {
        bookPackage();

    } else if (ae.getSource() == backButton) {
        this.setVisible(false);
    }
}



    /**
     * Main method for testing the BookPackage class
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BookPackage("Anonymous").setVisible(true);
        });
    }
 

}
