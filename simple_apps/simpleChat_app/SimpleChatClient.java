import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleChatClient{

    JTextArea incoming; 
    JTextField outgoing;
    BufferedReader reader;
    PrintWriter writer;
    Socket sock;

    public static void main(String[] args){
        SimpleChatClient client = new SimpleChatClient();
        client.go();
    }

    public void go() {
        
        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel mainPanel = new JPanel();
        incoming = new JTextArea(15,50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(qScroller);
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        setUpNetworking();
        
        /*
         * Start a new thread, using a new inner class as the 
         * Runnable (job) for the thread.  The thread's job is 
         * to read from the server's socket stream, displaying
         * any incoming messages in the scrolling text area.
         * */
        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(800,500);
        frame.setVisible(true);

    } // close go() method

    private void setUpNetworking(){
        try{
            /*
             * Using the socket to get the input and output streams. 
             * The output stream is used to send to the server, and 
             * the input stream so the new 'reader' thread can get
             * messages from the server.
             * */
            sock = new Socket("127.0.0.1", 5000);
            /* InputStreamReader is a bridge from byte streams to character streams:  It reads
             * bytes and decodes them into characters using a specified charset.  For top effeciency,
             * consider wrapping an InputStreamReader within a BufferedReader*/
            InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
            reader = new BufferedReader(streamReader); // bufferedReader accepts a Stream from socket
            writer = new PrintWriter(sock.getOutputStream()); // PrintWriter buffer gets
            System.out.println("networking established");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }// close setUpNetwork() method

    public class SendButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ev){
            try{
                writer.println(outgoing.getText());
                writer.flush();
            }catch(Exception ex){
                ex.printStackTrace();
            }

            outgoing.setText("");
            outgoing.requestFocus();
        }
    } // close SendButtonListener class

    public class IncomingReader implements Runnable{
        public void run(){
            String message;
            try{
                while((message = reader.readLine()) != null){
                    System.out.println("read " + message);
                    incoming.append(message + "\n");
                } // close while
            }catch(Exception ex){ex.printStackTrace();}
        }// close run method
    } // close IncomingReader class
}// close SimpleChatClienet class
