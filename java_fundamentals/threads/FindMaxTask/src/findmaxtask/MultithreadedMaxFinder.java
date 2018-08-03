/*
 * Example found on page 68
 * Java Network Programming 
 * book written by: 
 * Elliotte Rusty Harold
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 3, 2018
 */

/* Purpose: Use multiple threads to search an array of integers for a 
 *          max value. */

package findmaxtask;

import java.util.concurrent.*;
import java.util.Random;
import java.util.Scanner;

public class MultithreadedMaxFinder {
    
    
    static int[] intArray = new int[100000000];
    
    
    // Variables used to time how long it takes to find the max int 
    // with multiple threads
    static long startTime1 = 0;
    static long elapsedTime1 = 0;

    static long startTime2 = 0;
    static long elapsedTime2 = 0;
    
    
    
    // Using the class consturctor fill an array with random numbers
    MultithreadedMaxFinder(){
        Random rand = new Random();
        for(int i=0; i<intArray.length; i++){
            intArray[i] = rand.nextInt();
        }
    } 

    // Using mutiple threads find the max value of an integer array
    public static int maxMT(int[] data) throws InterruptedException, ExecutionException {
        
        // Start the timmer now for multithread operation
        startTime1 = System.currentTimeMillis();
        
        // Handle arrays with insuffcient elements
        if (data.length == 1) {
            return data[0];
        }else if (data.length == 0) {
            throw new IllegalArgumentException();
        }
        
        // split the job into 2 pieces
        FindMaxTask task1 = new FindMaxTask(data, 0, data.length/2);
        FindMaxTask task2 = new FindMaxTask(data, data.length/2, data.length);
        
        // spawn 2 threads
        ExecutorService service = Executors.newFixedThreadPool(2);
        
        // FindMaxTask impliments Callable<Integer> which returns an
        // Integer.  Future<Interger> accepts a Callable<Integer> object.
        Future<Integer> future1 = service.submit(task1);
        Future<Integer> future2 = service.submit(task2);
        
        // Stop the timer
        elapsedTime1 = System.currentTimeMillis() - startTime1;
        
        // shut down the service
        service.shutdown();
        return Math.max(future1.get(), future2.get());
    }

    // use a single thread to search an array for a max integer value
    public static int max(int[] data) throws InterruptedException, ExecutionException {
         // Start the timmer now for multithread operation
        startTime2 = System.currentTimeMillis();
        
        // Handle arrays with insuffcient elements
        if (data.length == 1) {
            return data[0];
        }else if (data.length == 0) {
            throw new IllegalArgumentException();
        }
        
        // spawn 1 threads
        ExecutorService service = Executors.newFixedThreadPool(1);
        
        // calcuate the max using one thread
        FindMaxTask task3 = new FindMaxTask(data, 0, data.length);
        Future<Integer> future3 = service.submit(task3);
        
        // Stop the timer
        elapsedTime2 = System.currentTimeMillis() - startTime2;

        // shut down the service
        service.shutdown();
        
        return future3.get();
    }
    
      public static void main(String[] args){
          
          Scanner reader = new Scanner(System.in);
          
          MultithreadedMaxFinder mmf = new MultithreadedMaxFinder();
 
          System.out.println("To get a compairable reading the search for max-"
                  + "value methods will be run during seperate instnaces, "
                  + "\nPress 1 for Multithread search for max value"
                  + "\nPress 2 for Singlethread search for max value\n");
          
          if (reader.nextInt() == 1)
          {
            try{
                System.out.println("The max value of the array is : " 
                        + mmf.maxMT(intArray));
                System.out.println("The multithreaded maxMT search took "
                + elapsedTime1 + " milliseconds to compute.");
            } catch (InterruptedException | ExecutionException ex) {
                System.out.println("Error: Excpetion caught");
            }
          } else {
            
            try{
                System.out.println("The max value of the array is : " 
                        + mmf.max(intArray));
                System.out.println("The single threaded max search took "
                + elapsedTime2 + " milliseconds to compute.");
            } catch (InterruptedException | ExecutionException ex) {
                System.out.println("Error: Excpetion caught");
            }
          }
      }
}
