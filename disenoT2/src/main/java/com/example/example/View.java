package com.example.example;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class View {
    private static int numStudents = 0;
    private static String[][] grades = new String[10][2];

    public static void main(String[] args) {
        JFrame frame = new JFrame("Input Grades");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 3));

        JLabel studentLabel = new JLabel("Student:", SwingConstants.LEFT);
        panel.add(studentLabel);

        JTextField studentField = new JTextField();
        panel.add(studentField);

        JLabel gradeLabel = new JLabel("Grade:", SwingConstants.LEFT);
        panel.add(gradeLabel);

        JTextField gradeField = new JTextField();
        panel.add(gradeField);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grades[numStudents][0] = studentField.getText();
                grades[numStudents][1] = gradeField.getText();
                numStudents++;

                studentField.setText("");
                gradeField.setText("");
            }
        });
        panel.add(submitButton);

        JButton displayButton = new JButton("Display");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < numStudents; i++) {
                    sb.append(grades[i][0]).append(": ").append(grades[i][1]).append("\n");
                }
                System.out.println("Grades:\n" + sb.toString());
            }
        });
        panel.add(displayButton);

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setPreferredSize(new Dimension(400, 300));
        frame.getContentPane().add(scrollPane);

        frame.pack();
        frame.setVisible(true);
    }
}