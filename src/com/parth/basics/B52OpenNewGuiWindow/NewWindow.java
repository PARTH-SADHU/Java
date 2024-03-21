package com.parth.basics.B52OpenNewGuiWindow;

import javax.swing.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello this is new Window");

    NewWindow(){

        label.setBounds(30,30,80,30);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(label);


        frame.setVisible(true);
    }
}
