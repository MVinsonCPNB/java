import java.io.*;
import java.net.*;
import java.util.*;

public class VerySimpleChatServer{
    
    ArrayList clientOutputStreams;

    public class ClientHandler implements Runnable {
       
       /* BufferedReader
        * Reads text from a character-input stream, buffering characters
        * so as to provide for the efficient reading of characters, arrays,
        * and lines. In general, each read request made of a Reader casuses
        * the corresponding read request to be made of the underlying 
        * character or byte stream. It is therefore advisable to wrap a 
        * BufferedReader around any Reader whose read() operations may be 
        * costly, such as FileReaders and InputStreamReaders.  
        * */
        BufferedReader reader;

        Socket sock;

        public ClientHandler(Socket clientSocket){
            try{
                sock = clientSocket;

                /* InputStreamReader
                 * is a bridge from byte streams to character streams: It reads bytes and
                 * decodes them into characters using a specified charset. The charset that
                 * it uses may be specified by the name or may be given explicitly, or the 
                 * platform's default charset may be accepted.  For efficiency, wrap the 
                 * InputStreamReader within a BufferedReader.
                 * */
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);
            }catch(Exception ex){ex.printStackTrace();}
        } // close ClientHander method

        public void run() {
            String message; 
            try{
                while ((message = reader.readLine()) != null){
                    System.out.println("read " + message);
                    tellEveryone(message);
                }// close while
            }catch (Exception ex){ex.printStackTrace();}
        }// close run() method
    } // close inner class ClientHandler

    public static void main (String[] args){
        new VerySimpleChatServer().go();
    }
    
    public void go() {
        clientOutputStreams = new ArrayList();
        try{

            /* ServerSocket
             * A server socket waits for requests to come in over the network. It performs
             * some operation based on that request, and then possibly returns a result
             * to the requester.  the actual work of the sver socket is performed by an
             * instance of the SocketImpl class. An application can change the socket factory
             * that creates the socket implementation to configure itself to create sockets 
             * appropriate to the local firewall.
             *      ServerSocket(int port, int backlog, InetAddress bindAddr)
             *      Create a server with the specified port, listening backlog, and local IP 
             *      address to bind to
             * */
            ServerSocket serverSock = new ServerSocket(5000);

            while(true){
                /* serverSock.accpet()
                 * Listens for a connection to be made to this socket and accpets it. The 
                 * method blocks until a connection is made.
                 * */
                Socket clientSocket = serverSock.accept();
                // setup a char to byte output stream to send messages to a client
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                // add the output stream to an array of active client streams
                clientOutputStreams.add(writer);
                
                // start a new thread for a specific client and run the clientHandler method
                // designed to read incomming messages from a client
                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.println("got a connection");
            }
        }catch(Exception ex){ex.printStackTrace();}
    } // close go() method

    public void tellEveryone(String message){
        Iterator it = clientOutputStreams.iterator();
        while(it.hasNext()){
            try{
                PrintWriter writer = (PrintWriter) it.next();
                writer.println(message);
                writer.flush();
            }catch(Exception ex){ex.printStackTrace();}
        } // end while
    }

} // close class VerySimpleChatServer
