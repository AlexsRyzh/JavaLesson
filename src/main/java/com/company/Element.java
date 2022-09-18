package com.company;

import javax.swing.*;
import java.awt.*;

public class Element {
    public static JButton customButton(String title, int width, int height){
        JButton newButton = new JButton();
        newButton.setSize(width,height);
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

    public static JTextField customJTextField(){
        JTextField newJTextField = new JTextField();
        newJTextField.setSize(422,48);
        newJTextField.setBackground(Color.decode("#5E5E5E"));
        newJTextField.setFont(new Font("Inter",0,32));
        newJTextField.setForeground(Color.white);
        newJTextField.setMargin(new Insets(0,10,0,10));
        return newJTextField;
    }
}
