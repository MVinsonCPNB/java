FindMaxTask Example
====================

The FindMaxTask example can be studied in detail on page 68 within the [Java Network Programming 4th Edition book](http://shop.oreilly.com/product/0636920028420.do), written by Elliotte Rusty Harold. The code seen with this repository was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
    * NetBeans 8.2
    * Operating System: Fedora 27:
    * JDK (verison 1.8.0_172-b11)-Java 8 SE 
    
### Purpose:
    * Send Callable jobs to the ExecutorService which returns a Future.
      Ask the Future for a result, if ready will respond accordingly, if
      the job is still running, the polling thread blocks until a result 
      is returned.  
    * FindMaxTask searches an array of integers for the max value.
    * MultithreadedMaxFinder.max() uses two threads to search for the max 
      value within an array.
    * A timer mechanism was added to test if the multithreaded max search was 
      faster than a single thread search.   
    * The code is slightly modified from the book's example.

### How to Run the FindMaxTask on Linux CLI:
    * To run the project from the command line, go to the dist folder and
      type the following:

      $ java -jar "FindMaxTask.jar"
    
    * Output:

     *Run #1
      To get a compairable reading the search for max-value methods will be run during seperate instnaces, 
      Press 1 for Multithread search for max value
      Press 2 for Singlethread search for max value

      1
      The max value of the array is : 2147483635
      The multithreaded maxMT search took 6 milliseconds to compute.

     *Run #2
      To get a compairable reading the search for max-value methods will be run during seperate instnaces, 
      Press 1 for Multithread search for max value
      Press 2 for Singlethread search for max value

      2
      The max value of the array is : 2147483571
      The single threaded max search took 9 milliseconds to compute.


