package ru.vitalynec.java.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    public MainWindow() {
        setup();
    }

    private void setup() {
        setBounds(500, 500, 400, 300);
        setTitle("Demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel(new GridLayout(1, 2));
        JButton jButton = new JButton("Exit");

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JButton jButton1 = new JButton("Button");
        jPanel.add(jButton);
        jPanel.add(jButton1);

        add(jPanel, BorderLayout.NORTH);
        setVisible(true);
    }
}
