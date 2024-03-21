package com.parth.basics.B51LayeredPane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

//        JLayeredPane :- Swing component that provides a third dimension for positioning
//        components.

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,150,150);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setBounds(100,100,150,150);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.yellow);
        label3.setBounds(150,150,150,150);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.add(label1,Integer.valueOf(0));
        layeredPane.add(label2,Integer.valueOf(2));
        layeredPane.add(label3,Integer.valueOf(1
        ));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(layeredPane);


        frame.setVisible(true);

    }
}
