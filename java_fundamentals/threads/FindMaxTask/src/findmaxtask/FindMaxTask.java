/*
 * Example found on page 68
 * Java Network Programming 
 * book written by: 
 * Elliotte Rusty Harold
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 3, 2018
 */

package findmaxtask;

import java.util.concurrent.Callable;
// A task that returns a result and may throw an exception. Implementors 
// define a single method with no arguments called call. The Callable interface
// is similar to Runnable, in that both are designed for classes whose instances
// are potentially executed by another thread. A Runnable, however, does not 
// return a result and cannot throw a checked exception.
public class FindMaxTask implements Callable<Integer> {

    private int[] data;
    private int start;
    private int end;
    
    FindMaxTask(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }
    
    // Required by the Callable interface
    public Integer call() {
        int max = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
            if (data[i] > max) max = data[i];
        }
        return max;
    }
}
