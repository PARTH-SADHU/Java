package com.parth.graphicaluserinterfacebasics;

import javax.swing.JOptionPane;

public class GuiDialogueBoxes {

    public static void main(String[] args) {

        String Name = JOptionPane.showInputDialog("Enter your Name:-");
        JOptionPane.showMessageDialog(null, "Welcome "+Name);

        int Age =Integer.parseInt(JOptionPane.showInputDialog("Enter your Age:-"));
        JOptionPane.showMessageDialog(null, "You're "+Age+"year's old" );

        double Height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height:-"));
        JOptionPane.showMessageDialog(null,"You're "+Height+"cm tall");
    }
}
