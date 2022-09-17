package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MilanXReal extends JFrame {

    private int milanScore = 0;
    private int realScore = 0;
    private JPanel mainFrame = new JPanel(null);
    private Timer timer1;


    public static int WIDTH_FRAME = 1100;
    public static int HEIGHT_FRAME = 800;

    public JButton milanBtn = Element.votingButton("AC Milan");
    public JButton realBtn = Element.votingButton("Real Madrid");
    public JLabel result = Element.customJlabel("Result: 0 X 0", Color.white, 96, WIDTH_FRAME,116);
    public JLabel lastS = Element.customJlabel("Last Scorer: N/A", Color.decode("#D32F2F"), 48,WIDTH_FRAME,58);
    public JLabel timer = Element.customJlabel("Time: 10s", Color.white, 40,220,48);
    public JLabel winner = Element.customJlabel("Winner: DRAW", Color.decode("#D32F2F"), 64,WIDTH_FRAME,77);

    public void grid(){
        result.setLocation(0,110);
        lastS.setLocation(0,226);
        milanBtn.setLocation(58,400);
        timer.setLocation(441, 441);
        realBtn.setLocation(742,400);
        winner.setLocation(0,595);
        winner.setVisible(false);

        timer1 = new Timer(1000, new ActionListener() { // Таймер на 10 секунд игры, после завершения - оповещение и блокировка кнопок
            int sec = 10;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sec == 0) {
                    timer1.stop();
                    if (milanScore > realScore) winner.setText("Winner: AC Milan");
                    else if (milanScore < realScore) winner.setText("Winner: Real Madrid");
                    else winner.setText("Winner: DRAW");
                    timer.setText("Stop Match");
                    milanBtn.setEnabled(false);
                    realBtn.setEnabled(false);
                    winner.setVisible(true);
                }
                else {
                    sec -= 1;
                    timer.setText("Time: " + String.valueOf(sec)+"s");
                }
            }
        });


        milanBtn.addActionListener(new ActionListener() { // Увеличение счета для AC Milan
            @Override
            public void actionPerformed(ActionEvent e) {
                if (milanScore<100){
                    milanScore += 1;
                    result.setText("Result: " + milanScore + " X " + realScore);
                    lastS.setText("Last Scorer: AC Milan");
                }

            }
        });

        realBtn.addActionListener(new ActionListener() { // Увеличение счета для Real Madrid
            @Override
            public void actionPerformed(ActionEvent e) {
                if (realScore<100){
                    realScore += 1;
                    result.setText("Result: " + milanScore + " X " + realScore);
                    lastS.setText("Last Scorer: Real Madrid");
                }

            }
        });
    }

    public MilanXReal(){
        super("Milan X Real");
        grid();
        mainFrame.setBackground(Color.decode("#0A0C39"));
        mainFrame.add(result);
        mainFrame.add(lastS);
        mainFrame.add(milanBtn);;
        mainFrame.add(realBtn);
        mainFrame.add(timer);
        mainFrame.add(winner);



        getContentPane().add(mainFrame);



        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH_FRAME,HEIGHT_FRAME);
        setBackground(Color.BLACK);
        setResizable(false);
        timer1.start();
        setVisible(true);
    }
}
