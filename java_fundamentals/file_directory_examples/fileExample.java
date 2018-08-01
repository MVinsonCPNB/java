import java.io.*;

public class fileExample{
    public static void main(String[] args){
    // Make a file
    File f = new File("TestFileDeleteAtWill.txt");
    
    // Make a directory
    File dir = new File("Test_Drive.d");
    dir.mkdir();

    // Add a new file to the directory
    File newFile = new File(dir, "NewTestFile.txt");

    // Write something to the files
    
    try{
        FileWriter writerTFDAW = new FileWriter(f);
        FileWriter writerNewFile = new FileWriter(newFile);

        writerTFDAW.write("It worked!\nNice....");
        writerNewFile.write("Again it worked!\n\n\tSweet....");

        writerTFDAW.close();
        writerNewFile.close();
    }catch(IOException ex){ex.printStackTrace();}

    // List the contents of a directory

    System.out.println("Printing the contents of directory at path:\n\t" + dir.getAbsolutePath());
    if (dir.isDirectory()){
        String[] dirContents = dir.list();
        for (int i = 0; i < dirContents.length; i++)
        {
            System.out.println("\t" + dirContents[i]);
        }
    }
   

   

    /*  Delete a file or directory (returns true if successful)
     *
     * boolean isDeleted = f.delete();
     * */
    }
} 
