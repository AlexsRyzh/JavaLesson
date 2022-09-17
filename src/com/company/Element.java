package com.company;

import javax.swing.*;
import java.awt.*;

public class Element {
    public static JButton votingButton(String title){
        JButton newButton = new JButton();
        newButton.setSize(300,130);
        newButton.setText(title);
        newButton.setBackground(Color.white);
        newButton.setFocusPainted(false);
        newButton.setFont(new Font("Inter", 0, 40));
        return  newButton;
    }

    public static JLabel customJlabel(String title, Color color, int fontSize, int width, int height){
        JLabel newJlabel = new JLabel(title);
        newJlabel.setSize(width, height);
        newJlabel.setForeground(color);
        newJlabel.setFont(new Font("Inter",0, fontSize));
        newJlabel.setOpaque(true);
        newJlabel.setBackground(Color.decode("#0A0C39"));
        newJlabel.setHorizontalAlignment(SwingConstants.CENTER);
        return newJlabel;
    }
}
