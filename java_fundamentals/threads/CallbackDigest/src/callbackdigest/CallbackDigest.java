/*
 * Example found on page 57
 * Java Network Programming 
 * book written by: 
 * Elliotte Rusty Harold
 * 
 * Recoded by: Michael Vinson
 * Date: July 31, 2018
 */

package callbackdigest;

import java.io.*;
import java.security.*;

public class CallbackDigest implements Runnable {

    private String filename;

    public CallbackDigest(String filename) {
        this.filename = filename;
    }
    
    @Override
    public void run() {
        try {
            // FileInputStream reads stream of raw bytes such as image data
            FileInputStream in = new FileInputStream(filename);
            // Get SHA-256 digest compatible object
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            // Place digest message into sha object
            DigestInputStream din = new DigestInputStream(in, sha);
            // Read data from in-object, computer, and stroe into sha-object
            while (din.read() != -1) ; // read entire file
            din.close();
            // Place digest btye stream sequence into byte array
            byte[] digest = sha.digest();
            CallbackDigestUserInterface.receiveDigest(digest, filename);
        } catch (IOException | NoSuchAlgorithmException ex ) {
            System.err.println(ex);
        }
    }
}
