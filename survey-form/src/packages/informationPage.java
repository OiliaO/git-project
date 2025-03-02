package packages;
import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BoxLayout(panel , BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.YELLOW);

        Font customFont = new Font("Arial", Font.BOLD, 16);

        // Name Label and Text Field

        JLabel nameLabel = new JLabel("Name");

        JPanel namePanel = new JPanel();

        JTextField nameField = new JTextField(15);
        namePanel.add(nameLabel);
        nameLabel.setFont(customFont);
        namePanel.add(nameField);
        nameField.setFont(customFont);
        namePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        nameField.setAlignmentX(Component.CENTER_ALIGNMENT);
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        namePanel.setBackground(Color.YELLOW);

        // Age Label and Text Field

        JLabel ageLabel = new JLabel("Age");
        JPanel agePanel = new JPanel();
        ageLabel.setFont(customFont);

        JTextField ageField = new JTextField(15);
        ageField.setFont(customFont);
        agePanel.add(ageLabel);
        agePanel.add(ageField);
        agePanel.setFont(customFont);
        agePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        ageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        ageField.setAlignmentX(Component.CENTER_ALIGNMENT);
        agePanel.setBackground(Color.YELLOW);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(customFont);
        JPanel emailPanel = new JPanel();
      
        JTextField emailField = new JTextField(15);
        emailPanel.add(emailLabel);
        emailPanel.add(emailField);
        emailPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        emailLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        emailField.setAlignmentX(Component.CENTER_ALIGNMENT);
        emailField.setFont(customFont);
        emailPanel.setBackground(Color.YELLOW);


        // Software Familiarity Level

        JLabel levelLabel = new JLabel("Software Familiarity Level");
        JPanel levelPanel = new JPanel();
        JRadioButton level1 = new JRadioButton("Beginner");
        level1.setFont(customFont);
        JRadioButton level2 = new JRadioButton("Intermediate");
        level2.setFont(customFont);
        JRadioButton level3 = new JRadioButton("Advanced");
        level3.setFont(customFont);
        JRadioButton level4 = new JRadioButton("No Experience");
        level4.setFont(customFont);
        levelPanel.add(levelLabel);
        levelPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        levelPanel.setBackground(Color.YELLOW);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);
        levelPanel.add(level1);
        levelPanel.add(level2);
        levelPanel.add(level3);
        levelPanel.add(level4);

        // Next Page Button
        JButton nextButton = new JButton("Next Page");

        JPanel nextPanel = new JPanel();
        nextButton.setFont(customFont);

        nextButton.addActionListener(e -> {
            // Remove current panel and move to Page2
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });
        nextPanel.add(nextButton);
        nextPanel.setBackground(Color.YELLOW);

        // Add components to the panel
        panel.add(namePanel);
        panel.add(agePanel);
        panel.add(emailPanel);
        panel.add(levelPanel);
        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}
