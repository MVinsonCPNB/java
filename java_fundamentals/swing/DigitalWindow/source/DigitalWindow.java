import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DigitalWindow{

    JTextArea outputTextArea;
    BufferedReader reader;
    PrintWriter fileWriter;
    Socket sock;

    public static void main(String[] args){
        DigitalWindow dw = new DigitalWindow();
        dw.go();
    }

    public void go(){
        // build GUI
        JFrame frame = new JFrame("Digital Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.darkGray);
        Font Font_MD = new Font("Courier New", Font.PLAIN, 16);

        // main display will display raw info about packets observed
        outputTextArea = new JTextArea(20,40);  // JTextArea(rows,columns)
        outputTextArea.setBackground(Color.lightGray);
        outputTextArea.setLineWrap(true);
        outputTextArea.setWrapStyleWord(true);
        outputTextArea.setEditable(false);
        outputTextArea.setFont(Font_MD);
        outputTextArea.setForeground(Color.WHITE);
        JScrollPane mdScroller = new JScrollPane(outputTextArea);
        mdScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        mdScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        // add the mdScroller.Pane.outputTextArea.TextArea to the mainPanel
        mainPanel.add(mdScroller);
        // add the mainPanel to the frame, set size, and visibility.
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(800,500);
        frame.setVisible(true);
        for(int x = 0; x < 1000; x++){
            outputTextArea.append(x + " ");
        }
    } // close go() method

/*  TODO: Use JTable to order and group packets*/
