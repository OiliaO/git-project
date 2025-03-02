import javax.swing.*;
import packages.informationPage;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Create and configure the main frame
        JFrame frame = new JFrame("فرم نظرسنجی");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        Font customFont = new Font("Arial", Font.BOLD, 16);

        // Create and configure the main panel
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.YELLOW);

        // Create title label
        JLabel title = new JLabel("فرم نظرسنجی");

        JPanel titlePanel = new JPanel();
        titlePanel.add(title);
        titlePanel.setBackground(Color.YELLOW);
              title.setFont(customFont);

        // Create start button
        JButton startButton = new JButton("شروع!");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton , BorderLayout.CENTER);
        buttonPanel.setBackground(Color.YELLOW);
              startButton.setFont(customFont);

        // Add components to the panel
        panel.add(titlePanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel , BorderLayout.CENTER);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
