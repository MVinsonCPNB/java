/*
 * Example found on page 65
 * Java Network Programming 
 * book written by: 
 * Elliotte Rusty Harold
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 2, 2018
 */

package instancecallbackdigest;

import java.io.*;
import java.security.*;

public class InstanceCallbackDigest implements Runnable {

    private String filename;
    private InstanceCallbackDigestUserInterface callback;
    
    // Store file name and object passed from InstanceCallback...Interface
    public InstanceCallbackDigest(String filename,
            InstanceCallbackDigestUserInterface callback) {
        this.filename = filename;
        this.callback = callback;
    }
    
    @Override
    public void run() {
        try {
            // FileInputStream reads a stream of raw bytes such as image data
            FileInputStream in = new FileInputStream(filename);
            // Get SHA-256 digest compatible object
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            // Place digest message into sha object
            DigestInputStream din = new DigestInputStream(in, sha);
            while (din.read() != -1) ; // read entire file
            din.close();
            // Place digest byte stream sequence into byte array
            byte[] digest = sha.digest();
            // Send digest to the passed InstanceCallback...Interface obj
            callback.receiveDigest(digest);
        } catch (IOException | NoSuchAlgorithmException ex ) {
            System.err.println(ex);
        }
    }
}
