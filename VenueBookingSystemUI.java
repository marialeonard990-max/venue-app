import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VenueBookingSystemUI {

    private JFrame frame;

    public VenueBookingSystemUI(String role) {
        initialize(role);
    }

    private void initialize(String role) {
        frame = new JFrame("Venue Booking System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        if (role.equalsIgnoreCase("admin")) {
            setupAdminInterface();
        } else if (role.equalsIgnoreCase("student")) {
            setupStudentInterface();
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid role! Please select either 'admin' or 'student'.");
            return;
        }

        frame.setVisible(true);
    }

    private void setupAdminInterface() {
        JPanel adminPanel = new JPanel();
        adminPanel.setLayout(new FlowLayout());
        adminPanel.add(new JLabel("Admin Interface"));
        JButton btnManageBookings = new JButton("Manage Bookings");
        btnManageBookings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Manage bookings logic goes here
                JOptionPane.showMessageDialog(frame, "Manage Bookings clicked!");
            }
        });
        adminPanel.add(btnManageBookings);
        frame.getContentPane().add(adminPanel);
    }

    private void setupStudentInterface() {
        JPanel studentPanel = new JPanel();
        studentPanel.setLayout(new FlowLayout());
        studentPanel.add(new JLabel("Student Interface"));
        JButton btnBookVenue = new JButton("Book Venue");
        btnBookVenue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Book venue logic goes here
                JOptionPane.showMessageDialog(frame, "Book Venue clicked!");
            }
        });
        studentPanel.add(btnBookVenue);
        frame.getContentPane().add(studentPanel);
    }

    public static void main(String[] args) {
        // For demonstration, we can pass role as a command line argument or through some UI mechanism.
        String userRole = args.length > 0 ? args[0] : "student"; // default to student
        new VenueBookingSystemUI(userRole);
    }
}