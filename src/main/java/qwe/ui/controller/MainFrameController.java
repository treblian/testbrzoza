package qwe.ui.controller;

import qwe.ui.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameController {

    private MainFrame mainFrame;
    private JButton welcomeBtn;
    private JTextArea welcomeTA;

    public MainFrameController() {
        initComponent();
        initListeners();
    }

    public void showMainFrameWindow(){
        mainFrame.setVisible(true);
    }

    private void initComponent() {
        mainFrame = new MainFrame();
        welcomeBtn = mainFrame.getWelcomeBtn();
        welcomeTA = mainFrame.getWelcomeTA();
    }

    private void initListeners() {
        welcomeBtn.addActionListener(new WelcomeBtnListener());
    }

    private class WelcomeBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            welcomeTA.append("Welcome costam\n");
        }
    }
}
