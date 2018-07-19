package qwe.ui.view;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;

    private JPanel mainPanel;
    private JButton welcomeBtn;
    private JTextArea welcomeTA;

    public MainFrame() {
        setSize(WIDTH, HEIGHT);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
    }

    public JButton getWelcomeBtn() {
        return welcomeBtn;
    }

    public JTextArea getWelcomeTA() {
        return welcomeTA;
    }


}
