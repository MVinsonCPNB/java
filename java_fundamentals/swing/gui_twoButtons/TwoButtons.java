// found on page 379 of Head First Java
// https://docs.oracle.com/javase/8/docs/api/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtons{
    JFrame frame;
    JLabel label;

    public static void main (String[] args){
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        // instead of passing (this) to the button's listener
        // registration method, pass a new instance of 
        // the appropriate listener class
        labelButton.addActionListener(new LabelListener());


        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("I'm a lable");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(900,900);
        frame.setVisible(true);
    }// end of go method

    class LabelListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            label.setText("Ouch!");
        }
    }  // close inner class

    class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            frame.repaint();
        } 
    }// close inner class
}// end of TwoButtons class
