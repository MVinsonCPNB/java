DigestRunnable Example
====================

The DigestRunnable example can be studied in detail on page 59 within the [Java Network Programming 4th Edition book](http://shop.oreilly.com/product/0636920028420.do), written by Elliotte Rusty Harold. The code seen with this repository was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
    * NetBeans 8.2
    * Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)-Java 8 SE 

### Purpose:
    * DigestRunnable.java reads a file and prints out the 
      SHA-256 message digest.

### How to Run the DigestRunnable on Linux CLI:
    * Navagate to {PATH_TO}/DigestRunnable/build/classes
    * $ java digestrunnable.DigestRunnable simpleTextFile.txt

      Outputs:
        This message prints before the message digest thread output prints.
        simpleTextFile.txt:
         A1005764047C2BEF236090A800E5777E450CEA29F55F61EB32EE2F8B27A87D5C
        ---The original length of the digest byte stream is 32 bytes.

###  How Run the Project within NetBeans IDE 8.2
    * Open project with NetBeans
    * Instruct NetBeans to pass an agrument to the DigestRunnable app
    * Select File > Project Properties (DigestRunnable) > Run
    * Within the Arguments text box enter your computers path to 
      the location of the projects text file used for the message digest. For
      example, my path looks like: 
      /home/{userName}/dev/java_apps/java_fundamentals/network_programming/DigestRunnable/build/classes/simpleTextFile.txt
    * Click Run > Run Project

      Outputs:
        This message prints before the message digest thread output prints.
        /home/mvinson/dev/java/java_fundamentals/network_programming/DigestRunnable/build/classes/simpleTextFile.txt:
         A1005764047C2BEF236090A800E5777E450CEA29F55F61EB32EE2F8B27A87D5C
        ---The original length of the digest byte stream is 32 bytes.
