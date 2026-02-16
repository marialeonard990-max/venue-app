import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VenueBookingApp extends JFrame {

    public VenueBookingApp() {
        // Set the title of the window
        super("Venue Booking Application");

        // Set the size of the window
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Add components to the panel
        JLabel label = new JLabel("Welcome to the Venue Booking App");
        panel.add(label);
        
        JButton bookButton = new JButton("Book a Venue");
        panel.add(bookButton);

        JButton viewButton = new JButton("View Bookings");
        panel.add(viewButton);

        // Add action listener for booking venues
        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Booking a venue...");
                // Place booking logic here
            }
        });

        // Add action listener for viewing bookings
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Viewing bookings...");
                // Place viewing logic here
            }
        });

        // Add the panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        // Create the main application frame
        SwingUtilities.invokeLater(() -> {
            VenueBookingApp app = new VenueBookingApp();
            app.setVisible(true);
        });
    }
}