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
import java.util.concurrent.*;


public class GZipAllFiles {
    
    public final static int THREAD_COUNT = 4;
   
    
    public static void main(String[] args) {
        
        ExecutorService pool = Executors.newFixedThreadPool(THREAD_COUNT);
        
        // read the file or directory name passed to the program
        for (String filename : args) {
            File f = new File(filename);
            // Tests whether the the file or directory denoted by this abstract 
            // pathname exists.
            if (f.exists()){
                // tests if file is a directory
                if (f.isDirectory()) {
                    // Get array of file names in current directory
                    File[] files = f.listFiles();
                    // Cycle through the list of files and create a new thread
                    // for their conversion to .gz 
                    for (int i = 0; i < files.length; i++) {
                        if (!files[i].isDirectory()) { // dont't recurse directories
                            Runnable task = new GZipRunnable(files[i]);
                            // Place thread in que to be run with the exe pool
                            pool.submit(task);
                        }
                    }
                } else {
                    // if a single file run one thread and exit program
                    Runnable task = new GZipRunnable(f);
                    pool.submit(task);
                }
            }
        }
        pool.shutdown();
    }
}
