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

import javax.xml.bind.*;  // For DatatypeConverter; requires Java 6 or JAXB 1.0

public interface CallbackDigestUserInterface {
    
    // Is started when a thread finished calculating a digest
    // used when running multiple threads
    public static void receiveDigest(byte[] digest, String name) {
        StringBuilder result = new StringBuilder(name);
        result.append(": ");
        result.append(DatatypeConverter.printHexBinary(digest));
        System.out.println(result);
    }
    
    public static void main(String[]  args) {
        
        for (String filename : args) {
            // Calculate the digest
            CallbackDigest cb = new CallbackDigest(filename);
            Thread t = new Thread(cb);
            t.start();
        }
    }
}
