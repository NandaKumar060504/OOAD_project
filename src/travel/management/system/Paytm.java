// package travel.management.system;

// import javax.swing.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class Paytm extends JFrame implements ActionListener {

//     JButton b1;

//     Paytm () {

//         this.setBounds(350, 150, 800, 600);

//         JEditorPane j = new JEditorPane();
//         j.setEditable(false);
//         try {
//             j.setPage("https://paytm.com");

//         } catch (Exception e) {
//             j.setContentType("text/html");
//             j.setText("<html>Could not Load, ERROR 404</html>");
//         }

//         JScrollPane js = new JScrollPane(j);
//         this.getContentPane().add(js);

//         b1 = new JButton("Back");
//         b1.setBounds(610, 20, 80, 40);
//         b1.addActionListener(this);
//         j.add(b1);
//     }

//     public void actionPerformed (ActionEvent ae) {
//         this.setVisible(false);
//         new Payment().setVisible(true);
//     }

//     public static void main(String[] args) {
//         new Paytm().setVisible(true);
//     }
// }

// package travel.management.system;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.net.URL;

// /**
//  * Paytm class provides an interface to access Paytm payment website
//  * within the travel management application.
//  */
// public class Paytm extends JFrame implements ActionListener {

//     private JButton backButton;
//     private static final int FRAME_WIDTH = 800;
//     private static final int FRAME_HEIGHT = 600;
//     private static final int FRAME_X = 350;
//     private static final int FRAME_Y = 150;
//     private static final String PAYTM_URL = "https://paytm.com";
    
//     /**
//      * Constructor for Paytm class.
//      * Initializes the UI components and loads the Paytm website.
//      */
//     public Paytm() {
//         initializeFrame();
//         JPanel mainPanel = createMainPanel();
//         add(mainPanel);
//     }
    
//     /**
//      * Initializes frame properties
//      */
//     private void initializeFrame() {
//         setTitle("Paytm Payment");
//         setBounds(FRAME_X, FRAME_Y, FRAME_WIDTH, FRAME_HEIGHT);
//         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//         setLayout(new BorderLayout());
//     }
    
//     /**
//      * Creates the main panel with the web content and back button
//      * @return JPanel containing the UI components
//      */
//     private JPanel createMainPanel() {
//         JPanel panel = new JPanel(new BorderLayout());
        
//         // Create and add web content
//         JEditorPane webContent = createWebContent();
//         JScrollPane scrollPane = new JScrollPane(webContent);
//         panel.add(scrollPane, BorderLayout.CENTER);
        
//         // Create and add button panel
//         JPanel buttonPanel = createButtonPanel();
//         panel.add(buttonPanel, BorderLayout.NORTH);
        
//         return panel;
//     }
    
//     /**
//      * Creates the web content pane
//      * @return JEditorPane with loaded web content
//      */
//     private JEditorPane createWebContent() {
//         JEditorPane webPane = new JEditorPane();
//         webPane.setEditable(false);
        
//         try {
//             webPane.setPage(new URL(PAYTM_URL));
//         } catch (Exception e) {
//             webPane.setContentType("text/html");
//             webPane.setText("<html><body><h2>Could not load the payment gateway.</h2>"
//                     + "<p>Error: " + e.getMessage() + "</p>"
//                     + "<p>Please check your internet connection and try again.</p></body></html>");
//             e.printStackTrace();
//         }
        
//         return webPane;
//     }
    
//     /**
//      * Creates the panel containing the back button
//      * @return JPanel with the back button
//      */
//     private JPanel createButtonPanel() {
//         JPanel buttonPanel = new JPanel();
//         buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
//         backButton = new JButton("Back");
//         backButton.setPreferredSize(new Dimension(80, 30));
//         backButton.addActionListener(this);
        
//         buttonPanel.add(backButton);
//         return buttonPanel;
//     }
    
//     /**
//      * Handles action events from UI components
//      * @param ae ActionEvent triggered by components
//      */
//     @Override
//     public void actionPerformed(ActionEvent ae) {
//         if (ae.getSource() == backButton) {
//             dispose(); // Close current window
//             new Payment().setVisible(true);
//         }
//     }
    
//     /**
//      * Main method for testing the Paytm class
//      * @param args Command line arguments
//      */
//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             new Paytm().setVisible(true);
//         });
//     }
// }



// package travel.management.system;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// /**
//  * Simulated Paytm Payment Window with success/failure handling.
//  */
// public class Paytm extends JFrame implements ActionListener {

//     private JButton successButton, failButton, backButton;

//     public Paytm() {
//         setTitle("Paytm Payment");
//         setBounds(400, 200, 500, 400);
//         setLayout(new BorderLayout());
//         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

//         JLabel label = new JLabel("Simulate Paytm Payment", JLabel.CENTER);
//         label.setFont(new Font("Tahoma", Font.BOLD, 20));
//         add(label, BorderLayout.NORTH);

//         JPanel buttonPanel = new JPanel();
//         buttonPanel.setLayout(new FlowLayout());

//         successButton = new JButton("Simulate Success");
//         failButton = new JButton("Simulate Failure");
//         backButton = new JButton("Back");

//         successButton.addActionListener(this);
//         failButton.addActionListener(this);
//         backButton.addActionListener(this);

//         buttonPanel.add(successButton);
//         buttonPanel.add(failButton);
//         buttonPanel.add(backButton);

//         add(buttonPanel, BorderLayout.CENTER);
//     }

//     @Override
//     public void actionPerformed(ActionEvent ae) {
//         if (ae.getSource() == successButton) {
//             JOptionPane.showMessageDialog(this, "Payment Successful!", "Status", JOptionPane.INFORMATION_MESSAGE);
//             dispose(); // Close the window
//             // Optionally: navigate to ticket/booking confirmation
//         } else if (ae.getSource() == failButton) {
//             JOptionPane.showMessageDialog(this, "Payment Failed. Please try again.", "Status", JOptionPane.ERROR_MESSAGE);
//             dispose(); // Close the window
//             new Payment().setVisible(true); // Return to previous screen
//         } else if (ae.getSource() == backButton) {
//             dispose(); // Just go back
//             new Payment().setVisible(true);
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             new Paytm().setVisible(true);
//         });
//     }
// }

// package travel.management.system;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// /**
//  * Simulated Paytm Payment Window with success/failure handling.
//  */
// public class Paytm extends JFrame implements ActionListener {

//     private JButton successButton, failButton, backButton;
//     private String hotelName, price;

//     public Paytm(String hotel, String totalPrice) {
//         hotelName = hotel;
//         price = totalPrice;

//         setTitle("Paytm Payment");
//         setBounds(400, 200, 500, 400);
//         setLayout(new BorderLayout());
//         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

//         JLabel label = new JLabel("Payment for Hotel: " + hotelName + " | Total Price: " + price, JLabel.CENTER);
//         label.setFont(new Font("Tahoma", Font.BOLD, 16));
//         add(label, BorderLayout.NORTH);

//         JPanel buttonPanel = new JPanel();
//         buttonPanel.setLayout(new FlowLayout());

//         successButton = new JButton("Simulate Success");
//         failButton = new JButton("Simulate Failure");
//         backButton = new JButton("Back");

//         successButton.addActionListener(this);
//         failButton.addActionListener(this);
//         backButton.addActionListener(this);

//         buttonPanel.add(successButton);
//         buttonPanel.add(failButton);
//         buttonPanel.add(backButton);

//         add(buttonPanel, BorderLayout.CENTER);
//     }

//     @Override
//     public void actionPerformed(ActionEvent ae) {
//         if (ae.getSource() == successButton) {
//             JOptionPane.showMessageDialog(this, "Payment Successful!", "Status", JOptionPane.INFORMATION_MESSAGE);
//             dispose(); // Close the window
//             // Optionally: navigate to ticket/booking confirmation
//         } else if (ae.getSource() == failButton) {
//             JOptionPane.showMessageDialog(this, "Payment Failed. Please try again.", "Status", JOptionPane.ERROR_MESSAGE);
//             dispose(); // Close the window
//             new Paytm(hotelName, price).setVisible(true); // Return to previous screen
//         } else if (ae.getSource() == backButton) {
//             dispose(); // Just go back
//             new Paytm(hotelName, price).setVisible(true);
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             new Paytm("Hotel XYZ", "Rs. 5000").setVisible(true); // Example, can be modified
//         });
//     }
// }

package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Paytm extends JFrame implements ActionListener {

    private JButton successButton, failButton, backButton;
    private String hotelName, price;

    public Paytm(String hotel, String totalPrice) {
        hotelName = hotel;
        price = totalPrice;

        setTitle("Paytm Payment");
        setBounds(400, 200, 500, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Payment for Hotel: " + hotelName + " | Total Price: " + price, JLabel.CENTER);
        label.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(label, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        successButton = new JButton("Simulate Success");
        failButton = new JButton("Simulate Failure");
        backButton = new JButton("Back");

        successButton.addActionListener(this);
        failButton.addActionListener(this);
        backButton.addActionListener(this);

        buttonPanel.add(successButton);
        buttonPanel.add(failButton);
        buttonPanel.add(backButton);

        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == successButton) {
            JOptionPane.showMessageDialog(this, "Payment Successful for " + hotelName + " (" + price + ")", "Status", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else if (ae.getSource() == failButton) {
            JOptionPane.showMessageDialog(this, "Payment Failed. Please try again.", "Status", JOptionPane.ERROR_MESSAGE);
            dispose();
            new Paytm(hotelName, price).setVisible(true);
        } else if (ae.getSource() == backButton) {
            dispose(); // ✅ No need to reopen same screen
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Paytm("Hotel XYZ", "Rs. 5000").setVisible(true);
        });
    }
}


