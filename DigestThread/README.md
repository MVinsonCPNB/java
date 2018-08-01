### The DigestThread example can be studied in detail 
### within the Java Network Programming 4th Edition book
### written by Elliotte Rusty Harold

### The DigestThread exmaple was recoded into NetBeans
### by Michael Vinson for practice purposes.

  Development Environment
    -- NetBeans 8.2
    -- Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)-Java 8 SE 

  Purpose:
    -- DigestThread.java reads a file and prints out the 
       SHA-256 message digest.

  How to Run the DigestThread on Linux CLI:
    -- Navagate to {PATH_TO}/DigestThread/build/classes
    -- $ java digestthread.DigestThread simpleTextFile.txt

  -- Outputs: 
    -- This message prints before the message digest thread output prints.
    -- 32ECFDC10824B19FCAA68C27E1FE1341D9B5FDF3D05D6168B7CA6AA547E1FDE3
    -- The original length of the digest byte stream is 32 bytes.

  How Run the Project within NetBeans IDE 8.2
    -- Open project with NetBeans
    -- Instruct NetBeans to pass an agrument to the DigestThread app
    -- Select File > Project Properties (DigestThread) > Run
    -- Within the Arguments text box enter your computers path to 
       the location of the projects text file used for the message digest. For
       example, my path looks like: 
       /home/mvinson/dev/java_apps/DigestThread/build/classes/simpleTextFile.txt
    -- Click Run > Run Project

  -- Outputs:
    -- This message prints before the message digest thread output prints.
    -- (...) 32ECFDC10824B19FCAA68C27E1FE1341D9B5FDF3D05D6168B7CA6AA547E1FDE3
    -- (...) The original length of the digest byte stream is 32 bytes.
