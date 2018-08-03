/*
 * Example found on page 89
 * Java Network Programming 
 * book written by: 
 * Elliotte Rusty Harold
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 3, 2018
 */

/* Purpose: gzip every file in a directory using 
 * Thread Pools and Executors. */

package gzipallfiles;

import java.io.*;
import java.util.zip.*;

public class GZipRunnable implements Runnable {
    
    private final File input;
    
    public GZipRunnable(File input) {
        this.input = input;
    }
    
    @Override
    public void run() {
        // don't compress an already compressed file
        if (!input.getName().endsWith(".gz")) {
            // Creates a file.gz in the input files directory 
            File output = new File(input.getParent(), input.getName() + ".gz");
            if(!output.exists()) { // Don't overwrite an existing file
                try ( // with resources; requires Java 7
                    
                    InputStream in = new BufferedInputStream(
                            new FileInputStream(input));
                        
                    OutputStream out = 
                            new BufferedOutputStream(
                                    new GZIPOutputStream(
                                            new FileOutputStream(output)));
                    ) {
                        int b;
                        // Read the file a byte at a time and write the result
                        // to the output file location
                        while ((b = in.read()) != -1) out.write(b);
                        // Forces any buffered output bytes to be written out.
                        out.flush();
                } catch (IOException ex) {
                    System.err.println(ex);
                }
            }
        }
    }
}
