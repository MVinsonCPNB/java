import java.io.*;

public class HelloJNI{
    static {
        // (below commented out requires the java program be run using:
        //      $java -Djava.library.path=. HelloJNI
        //      System.loadLibrary("hello");    // Load native library at runtime
 

        // Specifiy the java.library.path by getting the path from a newly 
        // create file in the directory
        String libPath = null;
        try{
            String mPath = new File (".").getCanonicalPath()+"/";
            String langKey = "java.library.path" ; 
            System.setProperty ( langKey, mPath ) ; 

            libPath = System.getProperty("java.library.path");
            System.out.println("java.library.path=" + libPath);
        }catch(Exception e){
            e.printStackTrace();
        }

        System.load(libPath+"libhello.so");
    }

    // Declare a native method sayHello() that receives nothing and returns void
    private native void sayHello();

    // Test Driver
    public static void main(String[] args){
        new HelloJNI().sayHello(); // invoke that native method
    }
}

/*
 *  Tutroial found at: https://www3.ntu.edu.sg/home/ehchua/programming/java/JavaNativeInterface.html
 *  The static initializer invokes System.loadLibrary() to load the native library "hello" (which
 *  contains the native method sayHello()) during the class loading. It will be mapped to "hello.dll"
 *  in Windows; or "libhello.so" in Unixes/Mac OS X. this library shall be included in Java's 
 *  library path (kept in Java system variable java.library.path);
 *
 *  next compile this code javac -h . HelloJNI.java 
 *
 *  for compilers before  JDK 8
 *  javac HelloJNI.java
 *  javah HelloJNI
 *
 * */
