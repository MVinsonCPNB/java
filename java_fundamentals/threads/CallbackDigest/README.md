CallbackDigest Example
====================

The CallbackDigest example can be studied in detail on page 65 within the [Java Network Programming 4th Edition book](http://shop.oreilly.com/product/0636920028420.do), written by Elliotte Rusty Harold. The code seen with this repository was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
    * NetBeans 8.2
    * Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)-Java 8 SE 

### Purpose:
    * CallbackDigest.java reads multiple files using a new thread for each and prints out the 
      SHA-256 message digest using a callback structure. This example shows how to let the main
      method sleep while threads complete their run method. There are many ways to accomplish
      this other than using a callback structure. If the main method is required to check weather 
      or not the thread has completed its task, then the setup is inefficient.
    * However, see InstanceCallbackDigest for a more common way of a callback solution.

### How to Run the CallbackDigest on Linux CLI:
    * Navagate to the .../dist/ directory
    * $ java -jar CallbackDigest.jar simpleTextFile.txt simpleTextFile2.txt simpleTextFile3.txt README.md
      Outputs:
        simpleTextFile2.txt: B509C2205A18F845A596AA8C623992BB5DA1AE7B96423D7FBFBCF775715CF011
        README.md: 8CEB678E3CE39195C3CBFF5D4635F7E603BC4288666CDE840AC23C378F6A47C0
        simpleTextFile3.txt: B509C2205A18F845A596AA8C623992BB5DA1AE7B96423D7FBFBCF775715CF011
        simpleTextFile.txt: B509C2205A18F845A596AA8C623992BB5DA1AE7B96423D7FBFBCF775715CF011
