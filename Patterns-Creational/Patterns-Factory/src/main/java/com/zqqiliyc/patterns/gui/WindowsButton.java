package com.zqqiliyc.patterns.gui;

import javax.swing.*;
import java.awt.*;

/**
 * @author zqqiliyc
 * @since 2024-10-20
 */
public class WindowsButton implements Button {
    protected JPanel panel = new JPanel();
    protected JFrame frame = new JFrame();
    protected JButton button;

    @Override
    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        frame.setSize(320, 200);
        frame.setVisible(true);
    }

    @Override
    public void onClick() {
        button = new JButton("EXIT");
        button.addActionListener(e -> {
            frame.setVisible(false);
            System.exit(0);
        });
    }
}
