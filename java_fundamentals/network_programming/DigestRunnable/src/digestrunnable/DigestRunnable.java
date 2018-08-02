/*
 * Example found on page 57
 * Java Network Programming 
 * book written by: 
 * Elliotte Rusty Harold
 * 
 * Recoded by: Michael Vinson
 * Date: August 1, 2018
 */

package digestrunnable;

import java.io.*;
import java.security.*;
import javax.xml.bind.*;  // for DatatypeConverter; requires Java 6 or JAXB 1.0


public class DigestRunnable implements Runnable {

    private String filename;
    
    public DigestRunnable(String filename) {
        this.filename = filename;
    }
    
    @Override
    public void run(){
        try {
            // FileInputStream reads streams of raw bytes such as image data
            FileInputStream in = new FileInputStream(filename);
            // Get SHA-256 digest compatible storage location configuration
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            // Place digest message into sha object
            DigestInputStream din = new DigestInputStream(in, sha);
            // din.read() reads a byte and updates the message digest (sha)
            while (din.read() != -1); 
            din.close();
            byte[] digest = sha.digest();
            
            StringBuilder result = new StringBuilder(filename);
            StringBuilder raw_result = new StringBuilder();
            
            result.append(":\n ");
            raw_result.append("---");
            result.append(DatatypeConverter.printHexBinary(digest));
            raw_result.append("The original length of the digest byte stream is " + digest.length + " bytes.");
            System.out.println(result);
            System.out.println(raw_result);
        } catch (IOException | NoSuchAlgorithmException ex) {
            System.err.println(ex);
        }
    }
    
    /**
     * @param args message digest file
     */
    public static void main(String[] args) {
        for (String filename : args){
            DigestRunnable dr = new DigestRunnable(filename);
            Thread t = new Thread(dr);
            t.start();
        }
        System.out.println("This message prints before the message digest"
                + " thread output prints.");
    }
    
}
