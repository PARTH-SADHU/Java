package com.parth.basics;

import javax.swing.*;
import java.awt.*;

public class B46JPanels {

//    JPanel :- It is  a swing component that is used to organize other component
//              within a window or a container
//            - It acts as a container to hold and manage other swing components like
//              buttons,icons, labels , textfields and many other components.

//   Layout Management :- JPanel supports different layout managers such as
//              FlowLayout, BorderLayout, GridLayout, and BoxLayout, allowing you
//              to arrange components in various ways within the panel.

    public static void main(String[] args) {

//        Creating a JFrame.
        JFrame frame = new JFrame();

//        Loading Original Icon in to variable.
        ImageIcon originalIcon = new ImageIcon("D:\\intellij_projects\\Java-DSA\\src\\muscle.png");

//        Getting the original image from the icon.
        Image originalImage = originalIcon.getImage();

//        Scale the original image to your desired dimensions
        Image scaledImage = originalImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

//        Storing the new saled image in to the image icon.
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
//        Creating a label.
        JLabel label = new JLabel();
        label.setText("Hii this is label");
        label.setIcon(scaledImageIcon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0, 40,40);


//        Creating a JPanel.
        JPanel orangePanel = new JPanel();
        orangePanel.setBackground(Color.orange);
        orangePanel.setBounds(0,0,500,170);

        JPanel whitePanel = new JPanel();
        whitePanel.setBackground(Color.white);
        whitePanel.setBounds(0,170,500,170);

//        If you want to change the position of a component or a label in a panel
//        then you can use borderlayout which will centarise the component and then you can change the position manually.

        whitePanel.setLayout(new BorderLayout());

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,340,500,170);
        greenPanel.setLayout(new BorderLayout());

//        Setting a default behaviour of closing the program when the close red button is clicked.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Setting the height and width of the frame
        frame.setSize(700,700);
//        Enabling the visibility of the frame
        frame.setVisible(true);
        frame.setLayout(null);
        whitePanel.add(label);
        frame.add(orangePanel);
        frame.add(whitePanel);
        frame.add(greenPanel);



    }

}
