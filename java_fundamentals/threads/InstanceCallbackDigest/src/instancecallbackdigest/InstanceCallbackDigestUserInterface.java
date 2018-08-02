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

import javax.xml.bind.*; // For DatatypeConverter; requires Java 6 or JAXB 1.0

public class InstanceCallbackDigestUserInterface {
    
    private String filename;
    private byte[] digest;
    
    public InstanceCallbackDigestUserInterface(String filename) {
        this.filename = filename;
    }
    
    // Invoked by the main method to start a new digest thread
    public void calculateDigest() {
        // Pass filename and the active object; start new thread
        InstanceCallbackDigest cb = new InstanceCallbackDigest(filename, this);
        Thread t = new Thread(cb);
        t.start();
    }
    
    // When a thread is done this method gets the finished digest
    void receiveDigest(byte[] digest) {
        this.digest = digest;
        // @Override toString to print the returned message digest
        System.out.println(this);
    }
    
    // when an object is passed to println toString() is called by defualt
    @Override
    public String toString() {
        String result = filename + ":\n\t----";
        if (digest != null) {
            result += DatatypeConverter.printHexBinary(digest);
        } else {
            result += "digest not available";
        }
        return result;
    }
    
    public static void main(String[] args){
        for (String filename : args) {
            // Calculate the digest
            InstanceCallbackDigestUserInterface d =
                    new InstanceCallbackDigestUserInterface(filename);
            d.calculateDigest();
        }
    }
    
}
