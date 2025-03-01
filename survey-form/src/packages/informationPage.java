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

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("اسم");
        JPanel namePanel = new JPanel();
        JTextField nameField = new JTextField(15);
        namePanel.add(nameLabel);
        namePanel.add(nameField);
        namePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        nameField.setAlignmentX(Component.CENTER_ALIGNMENT);
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        namePanel.setBackground(Color.YELLOW);

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("سن");
        JPanel agePanel = new JPanel();
        JTextField ageField = new JTextField(15);
        agePanel.add(ageLabel);
        agePanel.add(ageField);
        agePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        ageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        ageField.setAlignmentX(Component.CENTER_ALIGNMENT);
        agePanel.setBackground(Color.YELLOW);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("ایمیل");
        JPanel emailPanel = new JPanel();
        JTextField emailField = new JTextField(15);
        emailPanel.add(emailLabel);
        emailPanel.add(emailField);
        emailPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        emailLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        emailField.setAlignmentX(Component.CENTER_ALIGNMENT);
        emailPanel.setBackground(Color.YELLOW);


        // Software Familiarity Level
        JLabel levelLabel = new JLabel("سطح آشنایی با نرم افزارهای مشابه");
        JPanel levelPanel = new JPanel();
        JRadioButton level1 = new JRadioButton("مبتدی");
        JRadioButton level2 = new JRadioButton("متوسط");
        JRadioButton level3 = new JRadioButton("پیشرفته");
        JRadioButton level4 = new JRadioButton("بدون آشنایی");
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
        JButton nextButton = new JButton("صفحه بعد");
        JPanel nextPanel = new JPanel();
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
