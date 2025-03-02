package packages;

import javax.swing.*;
import java.awt.*;

public class questionsPage {

    public void create(JFrame frame) {
        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel , BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.YELLOW);

        // Question 1
        JLabel question1 = new JLabel("چقدر رابط کاربری نرم افزار از نظر شما جذاب است؟");
        JPanel question1Panel = new JPanel();

        JRadioButton radio1_1 = new JRadioButton("۱");
        JRadioButton radio1_2 = new JRadioButton("۲");
        JRadioButton radio1_3 = new JRadioButton("۳");
        JRadioButton radio1_4 = new JRadioButton("۴");
        JRadioButton radio1_5 = new JRadioButton("۵");
        question1Panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        question1Panel.setBackground(Color.YELLOW);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(radio1_1);
        group1.add(radio1_2);
        group1.add(radio1_3);
        group1.add(radio1_4);
        group1.add(radio1_5);

        question1Panel.add(question1);
        question1Panel.add(radio1_1);
        question1Panel.add(radio1_2);
        question1Panel.add(radio1_3);
        question1Panel.add(radio1_4);
        question1Panel.add(radio1_5);

        // Question 2
        JLabel question2 = new JLabel("آیا دسترسی به امکانات مختلف نرم افزار برای شما آسان است؟");
        JPanel question2Panel = new JPanel();

        JRadioButton radio2_1 = new JRadioButton("۱");
        JRadioButton radio2_2 = new JRadioButton("۲");
        JRadioButton radio2_3 = new JRadioButton("۳");
        JRadioButton radio2_4 = new JRadioButton("۴");
        JRadioButton radio2_5 = new JRadioButton("۵");
        question2Panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        question2Panel.setBackground(Color.YELLOW);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(radio2_1);
        group2.add(radio2_2);
        group2.add(radio2_3);
        group2.add(radio2_4);
        group2.add(radio2_5);

        question2Panel.add(question2);
        question2Panel.add(radio2_1);
        question2Panel.add(radio2_2);
        question2Panel.add(radio2_3);
        question2Panel.add(radio2_4);
        question2Panel.add(radio2_5);

        // Question 3
        JLabel question3 = new JLabel("چقدر طراحی صفحات نرم افزار ساده و کاربرپسند است؟");
        JPanel question3Panel = new JPanel();

        JRadioButton radio3_1 = new JRadioButton("۱");
        JRadioButton radio3_2 = new JRadioButton("۲");
        JRadioButton radio3_3 = new JRadioButton("۳");
        JRadioButton radio3_4 = new JRadioButton("۴");
        JRadioButton radio3_5 = new JRadioButton("۵");
        question3Panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        question3Panel.setBackground(Color.YELLOW);

        ButtonGroup group3 = new ButtonGroup();
        group3.add(radio3_1);
        group3.add(radio3_2);
        group3.add(radio3_3);
        group3.add(radio3_4);
        group3.add(radio3_5);

        question3Panel.add(question3);
        question3Panel.add(radio3_1);
        question3Panel.add(radio3_2);
        question3Panel.add(radio3_3);
        question3Panel.add(radio3_4);
        question3Panel.add(radio3_5);

        // Question 4
        JLabel question4 = new JLabel("آیا رنگ ها و فونت های استفاده شده در نرم افزار مناسب هستند؟");
        JPanel question4Panel = new JPanel();

        JRadioButton radio4_1 = new JRadioButton("۱");
        JRadioButton radio4_2 = new JRadioButton("۲");
        JRadioButton radio4_3 = new JRadioButton("۳");
        JRadioButton radio4_4 = new JRadioButton("۴");
        JRadioButton radio4_5 = new JRadioButton("۵");
        question4Panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        question4Panel.setBackground(Color.YELLOW);

        ButtonGroup group4 = new ButtonGroup();
        group4.add(radio4_1);
        group4.add(radio4_2);
        group4.add(radio4_3);
        group4.add(radio4_4);
        group4.add(radio4_5);

        question4Panel.add(question4);
        question4Panel.add(radio4_1);
        question4Panel.add(radio4_2);
        question4Panel.add(radio4_3);
        question4Panel.add(radio4_4);
        question4Panel.add(radio4_5);

        // Next button to go to Page3
        JButton nextButton = new JButton("صفحه بعد");
        nextButton.addActionListener(e -> {
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            thankYouPage thankYouPage = new thankYouPage();
            thankYouPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(question1Panel);

        panel.add(question2Panel);

        panel.add(question3Panel);

        panel.add(question4Panel);

        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}
