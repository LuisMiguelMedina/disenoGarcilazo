package com.example.view;
import javax.swing.*;
import java.awt.*;

public class View {
    public View() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Set grade");
        JLabel label = new JLabel("");



        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridBagLayout());
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new View();
    }
}
