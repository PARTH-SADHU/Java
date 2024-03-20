package com.parth.basics;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class B45Jframe {
    public static void main(String[] args) {

//        Jframe is a gui window in which we can add new components.

        // Load the original image
        ImageIcon originalIcon = new ImageIcon("D:\\intellij_projects\\Java-DSA\\src\\muscle.png");

// Get the original image from the icon
        Image originalImage = originalIcon.getImage();

// Scale the original image to your desired dimensions
        Image scaledImage = originalImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

// Create a new ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

// Create the label with the scaled icon
        JLabel label = new JLabel();


        Border border = BorderFactory.createLineBorder(Color.black, 3);
        label.setText("Hii this is the label");
        label.setIcon(scaledIcon);
        label.setHorizontalTextPosition(JLabel.CENTER); // sets text left, center and right of imageicon.
        label.setVerticalTextPosition(JLabel.TOP); // sets text top, center and bottom of imageicon.
//        label.setForeground(new Color(46, 38, 1, 1));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setForeground(Color.black);
        label.setIconTextGap(100); // set gap of text to image.
        label.setBackground(Color.red); // set background color of label.
        label.setOpaque(true); // display background color.
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);// centers vertically.
        label.setHorizontalAlignment(JLabel.CENTER); // centers horizontally.
        label.setBounds(0,0,250,250); //sets x,y position within the frame as well as dimensions


        JFrame frame = new JFrame(); // Creating a jframe using its object without title

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the code when clicked red cross button
        frame.setTitle("First JFrame");// Sets the title of the frame.
        frame.setVisible(true);//Enables the visibility of the frame
        frame.setSize(450,450);//sets the X and Y dimensions of the frame.
//        frame.setLayout(null); // Layout manager will have the control of the frame.
        frame.add(label);
        frame.pack();




    }
}
