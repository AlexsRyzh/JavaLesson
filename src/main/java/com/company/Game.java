package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game extends JFrame {
    public static int WIDTH_FRAME = 1100;
    public static int HEIGHT_FRAME = 800;
    private JPanel mainFrame = new JPanel(null);
    private int attemp = 3;
    private int digit;


    private JLabel title = Element.customJlabel(
            "Угадайка",
            Color.white,
            98,
            WIDTH_FRAME,
            116
    );
    private JButton start = Element.customButton(
            "Загадать число от 0 до 20",
            620,
            130
    );
    private JLabel label = Element.customJlabel(
            "Число загадано",
            Color.decode("#D32F2F"),
            48,
            WIDTH_FRAME,
            58
    );
    private JLabel label2 = Element.customJlabel(
            "Предположите число в диапазоне [0,20]",
            Color.white,
            40,
            WIDTH_FRAME,
            48
    );
    private JButton send = Element.customButton(
            "Отправить",
            300,
            130
    );
    private JTextField number = Element.customJTextField();
    private JLabel error = Element.customJlabel(
            "Это не число",
            Color.decode("#D32F2F"),
            24,
            WIDTH_FRAME,
            29
    );
    private JLabel attemptLabel = Element.customJlabel(
            "Кол-во попыток: 3",
            Color.white,
            36,
            326,
            44
    );
    private JLabel result = Element.customJlabel(
            "Вы угадали число",
            Color.decode("#D32F2F"),
            96,
            WIDTH_FRAME,
            116
    );
    private JLabel resultNumber = Element.customJlabel(
            "Число: "+digit,
            Color.decode("#D32F2F"),
            96,
            WIDTH_FRAME,
            116
    );


    private void event(){
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start.setVisible(false);
                label.setVisible(true);
                label2.setVisible(true);
                send.setVisible(true);
                attemptLabel.setVisible(true);
            }
        });
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = number.getText();
                try {
                    int numb = Integer.parseInt(text);
                    if (numb<0 && numb>20){
                        throw new NumberFormatException();
                    }
                    attemp-=1;
                    attemptLabel.setText("Кол-во попыток: "+attemp);
                    if (numb<digit){
                        label.setText("Загаданное число больше");
                    }
                    else{
                        label.setText("Загаданное число меньше");
                    }
                    if (numb == digit){
                        zero();
                        result.setVisible(true);
                        resultNumber.setVisible(true);

                    }else if (attemp==0){
                        zero();
                        result.setText("Вы не угадали число");
                        result.setVisible(true);
                        resultNumber.setVisible(true);
                    }

                }catch (NumberFormatException err) {
                    error.setText("Это не число или число не попало в диапазон");
                    error.setVisible(true);
                }
            }
        });
    }

    private void zero(){
        attemptLabel.setVisible(false);
        label.setVisible(false);
        label2.setVisible(false);
        number.setVisible(false);
        error.setVisible(false);
        send.setVisible(false);
    }

    private void grid(){
        title.setLocation(0,110);
        start.setLocation(240,400);
        label.setLocation(0,226);
        label.setVisible(false);
        label2.setLocation(0,352);
        label2.setVisible(false);
        send.setLocation(401,533);
        send.setVisible(false);
        number.setLocation(345,426);
        attemptLabel.setLocation(29,34);
        attemptLabel.setVisible(false);
        error.setLocation(0,480);
        error.setVisible(false);
        result.setLocation(0,310);
        resultNumber.setLocation(0,450);
        result.setVisible(false);
        resultNumber.setVisible(false);
        resultNumber.setText("Число: "+digit);
    }


    public Game(){
        super("Game");
        Random rand = new Random();
        digit = rand.nextInt(0,20);
        grid();
        event();
        mainFrame.setBackground(Color.decode("#0A0C39"));
        mainFrame.add(title);
        mainFrame.add(start);
        mainFrame.add(label);
        mainFrame.add(label2);
        mainFrame.add(send);
        mainFrame.add(number);
        mainFrame.add(error);
        mainFrame.add(attemptLabel);
        mainFrame.add(result);
        mainFrame.add(resultNumber);
        getContentPane().add(mainFrame);





        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH_FRAME,HEIGHT_FRAME);
        setResizable(false);
        setVisible(true);
    }

}
