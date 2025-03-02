package packages;
import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Font customFont = new Font("Arial", Font.BOLD, 16);

        // Create thank you label

        JLabel thankYouLabel = new JLabel("Thank you for your participation!");

        thankYouLabel.setHorizontalAlignment(SwingConstants.CENTER);
        thankYouLabel.setVerticalAlignment(SwingConstants.CENTER);
        JPanel thankYouPanel = new JPanel(new BorderLayout());
        thankYouPanel.setBackground(Color.YELLOW);
        thankYouLabel.setFont(customFont);

        thankYouPanel.add(thankYouLabel, BorderLayout.CENTER);

        // Add components to the panel
        panel.add(thankYouPanel, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);


    }


}
