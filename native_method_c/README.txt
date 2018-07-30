# Start here https://www3.ntu.edu.sg/home/ehchua/programming/java/JavaNativeInterface.html
# For instructions on modifying the java.library.path see:
         http://saurabhsharma123k.blogspot.com/2017/07/java-jni-and-cc-from-command-line.html


# 1.) Write a Java Class HelloJNI.java
# 2.) Compile the Java Program HelloJNI.java & Generate the C/C++ Header File HelloJNI.h
#       javac -h . HelloJNI.java
# 3.) Write the C program HelloJNI.c
# 4.) Set the JAVA_HOME variable (below)

    # Workhorse Java Path is used to compile the Java_native_interface project

    [mvinson@DESKTOP-1COC0NQ include]$ echo $PWD
    /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.172-9.b11.fc27.x86_64
    [mvinson@DESKTOP-1COC0NQ java-1.8.0-openjdk-1.8.0.172-9.b11.fc27.x86_64]$ export JAVA_HOME=$PWD
    [mvinson@DESKTOP-1COC0NQ java-1.8.0-openjdk-1.8.0.172-9.b11.fc27.x86_64]$ echo $JAVA_HOME
    /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.172-9.b11.fc27.x86_64

# 5.) Compile the program
    gcc - fPIC -I"$JAVA_HOME/include" -I"$JAVA_HOME/include/linux" -shared -i libhello.so HelloJNI.c
# 6.) Run the program
    java -Djava.library.path=. HelloJNI
    (modified) java HelloJNI  (works with the newest version of the program see the Saurabjsharma link above)

# 7.) Compile a JAR file
    jar -cvmf manifest.txt hellowold_app.jar HelloJNI.c HelloJNI.class HelloJNI.h libhello.so 

