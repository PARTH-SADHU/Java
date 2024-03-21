package com.parth.basics.B52OpenNewGuiWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("NEW WINDOW");

    LaunchPage(){
        button.setBounds(100,100,200,70);
        button.setFocusable(false);
        button.addActionListener(this);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.add(button);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            frame.dispose();
            NewWindow myWindow = new NewWindow();
        }

    }
}
