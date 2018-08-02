InstanceCallbackDigest Example
====================

The InstanceCallbackDigest example can be studied in detail on page 65 within the [Java Network Programming 4th Edition book](http://shop.oreilly.com/product/0636920028420.do), written by Elliotte Rusty Harold. The code seen with this repository was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
    * NetBeans 8.2
    * Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)-Java 8 SE 

### Purpose:
    * InstanceCallbackDigest.java reads multiple files using a new instance and thread for each
      message digest computation. 
    * This callback setup is show to be the most common and effective.

### How to Run the InstanceCallbackDigest on Linux CLI:
    * Navagate to the .../dist/ directory

    * $ java -jar InstanceCallbackDigest.jar *.txt *.md

    * Output:
      simpleTextFile2.txt:
        ----B509C2205A18F845A596AA8C623992BB5DA1AE7B96423D7FBFBCF775715CF011
      README.md:
        ----CF5BD86D500FFF8949D460467A0725F381F483546224663F658148833D1B671E
      simpleTextFile3.txt:
        ----B509C2205A18F845A596AA8C623992BB5DA1AE7B96423D7FBFBCF775715CF011
      simpleTextFile.txt:
        ----B509C2205A18F845A596AA8C623992BB5DA1AE7B96423D7FBFBCF775715CF011

