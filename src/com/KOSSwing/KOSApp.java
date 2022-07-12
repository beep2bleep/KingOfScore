package com.KOSSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KOSApp {
    private JButton btnMessage;
    private JPanel panelMain;
    private JComboBox comboBox1;
    private JRadioButton radioButton1;
    private JPanel operatorPanel;

    public KOSApp() {
        btnMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello World");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("KOSApp");
        KOSApp app = new KOSApp();
        frame.setContentPane(app.panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);


        // Setting Bounds of JFrame.
        frame.setBounds(100, 100, 500, 500);



        ButtonGroup G = new ButtonGroup();
        G.add(new JCheckBox("Beginner Blake") );
        G.add(new JCheckBox("Classic Loadout Louis") );

        //this.Add(G);
        //operatorPanel.add(G);
        //frame.add(new JCheckBox("Beginner !!!!"));
        //frame.add(new JLabel("Qualification"));

        app.operatorPanel.add(new JLabel("Qualification"));

    }
}
