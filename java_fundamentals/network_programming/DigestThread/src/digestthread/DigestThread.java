/*
 * Example found on page 57
 * Java Network Programming 
 * book written by: 
 * Elliotte Rusty Harold
 * 
 * Recoded by: Michael Vinson
 * Date: July 31, 2018
 */
package digestthread;

import java.io.*;
import java.security.*;
import javax.xml.bind.*;  // for DatatypeConverter; requires Java 6 or JAXB 1.0

/**
 * @author mvinson
 */
public class DigestThread extends Thread {

    /**
     * @param args the command line arguments
     */
    
    private String filename;
    
    public DigestThread(String filename) {
        this.filename = filename;
    }
    
    @Override
    public void run() {
        System.out.println("TEst");
        try {
            // FileInputStream reads streams of raw bytes such as image data
            FileInputStream in = new FileInputStream(filename);
            // Get SHA-256 digest compatible storage location
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            // Place digest message into sha object
            DigestInputStream din = new DigestInputStream(in, sha);
            // Read data from in-object, compute, and store into sha-object
            while (din.read() != -1);
            // Close DigestInputStream
            din.close();
            // Place Digest byte stream sequence into byte array
            byte[] digest = sha.digest();
            
            // StringBuilder inserts or appends data to a new string
            StringBuilder result = new StringBuilder(filename);
            result.append(": ");
            result.append(DatatypeConverter.printHexBinary(digest));
            System.out.println(result);
            
             // StringBuilder inserts or appends data to a new string
            StringBuilder raw_result = new StringBuilder(filename);
            raw_result.append(": ");
            raw_result.append("The original length of the digest byte stream is " + digest.length + " bytes.");
            System.out.println(raw_result);
            
        } catch (IOException | NoSuchAlgorithmException ex) {
            System.err.println(ex);
        }
    }
    
    public static void main(String[] args) {
        for (String filename : args) {
            Thread t = new DigestThread(filename);
            t.start();
        }
        System.out.println("This message prints before the message digest thread"
                + " output prints.");
    }
    
}
