GZipAllFiles Example
====================

The GZipAllFiles example can be studied in detail on page 89 within the [Java Network Programming 4th Edition book](http://shop.oreilly.com/product/0636920028420.do), written by Elliotte Rusty Harold. The code seen with this repository directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
    * NetBeans 8.2
    * Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)-Java 8 SE 

### Purpose:
    * GZipAllFiles.java will GZIP all files in a directory using a Thread Pool
      and a Executor. 

### How to Run the GZipAllFiles on Linux CLI:
    * Navagate to the .../dist/ directory

    * java -jar GZipAllFiles.jar zipThis/

    * Output:
      $ ls zipThis/
      README2.TXT  README2.TXT.gz 
      README3.TXT  README3.TXT.gz 
      README4.TXT  README4.TXT.gz 
      README.TXT  README.TXT.gz
