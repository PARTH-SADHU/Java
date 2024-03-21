package com.parth.basics.B48ButtonLayoutManager;

import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.*;

public class MyFrame extends JFrame{
    MyFrame(){

//        Settting a default behaviour of closing the program everytime the close button is clicked.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Setting the size of the whole frame.
        this.setSize(550,550);
//        Setting the visibility of the frame to true so that it is visible
        this.setVisible(true);
//        Changing the default layoutmanager.
        this.setLayout(new BorderLayout(5,5));


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel5.setLayout(new BorderLayout(1,1));
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.blue);
        panel7.setBackground(Color.red);
        panel8.setBackground(Color.lightGray);
        panel9.setBackground(Color.darkGray);
        panel10.setBackground(Color.magenta);

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));


        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.EAST);
        panel5.add(panel8,SOUTH);
        panel5.add(panel9,WEST);
        panel5.add(panel10,CENTER);

        panel1.setBackground(Color.blue);
        panel2.setBackground(Color.red);
        panel3.setBackground(Color.lightGray);
        panel4.setBackground(Color.darkGray);
        panel5.setBackground(Color.magenta);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.EAST);
        this.add(panel3,BorderLayout.SOUTH);
        this.add(panel4,BorderLayout.WEST);
        this.add(panel5,CENTER);

    }
}
