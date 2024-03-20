package com.parth.basics.B47JButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {


    JButton button;
    JLabel label;
    MyFrame(){
//        Getting image icon from the path of the image.
        ImageIcon clickMeOriginalIcon = new ImageIcon("D:\\intellij_projects\\Java-DSA\\src\\click.png");
//        Converting the icon into image to scale the image in the form or dimensions we want
        Image clickMeOriginalImage = clickMeOriginalIcon.getImage();
//        Scaling the in the dimensions we want.
        Image originalImage = clickMeOriginalImage.getScaledInstance(50,50,Image.SCALE_SMOOTH);
//        Converting the image in to icon again.
        ImageIcon clickMeIcon = new ImageIcon(originalImage);

        ImageIcon laughingEmoji = new ImageIcon("D:\\intellij_projects\\Java-DSA\\src\\silly.png");
        label = new JLabel();
        label.setIcon(laughingEmoji);
        label.setBounds(10, 10, 200, 200);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,250,105);
        button.setText("Click Me");
//        to get rid of the focusable text border.
        button.setFocusable(false);
        button.setIcon(clickMeIcon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setIconTextGap(15);
        button.setFont(new Font("Helvetica", Font.BOLD, 20));
        button.setForeground(Color.gray);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(true);





//        Lambda Expression
//        button.addActionListener(e -> System.out.println("Poo"));

        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(550,550);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("Button Clicked");
            label.setVisible(true);
        }
    }
}
