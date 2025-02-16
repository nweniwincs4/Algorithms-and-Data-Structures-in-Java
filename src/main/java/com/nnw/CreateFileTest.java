
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileTest {

    public static void main(String[] args) {
        // try {
        //     File myFile = new File("filename.txt");
        //     // windows
        //     // File myFile = new File("C:\\Users\\MyName\\filename.txt");
        //     // mac
        //     // File myFile = new File("..//filename.txt"); // mac: step back to the higher level
        //     // File myFile = new File("/Users/nweniwin/Documents/Java Study/Algorithms-and-Data-Structures-in-Java/filename.txt");
        //     if (myFile.createNewFile()){
        //         System.out.printf("New file : %s is created.",myFile.getName());
        //         // System.out.printf("The file is created at %s",myFile.getAbsolutePath());
        //     }else{
        //         System.out.println("File already exists");
        //         // System.out.printf("The file is at %s",myFile.getAbsolutePath());
        //     }
        // } catch (IOException e) {
        //     System.out.println("An error occured");
        //     e.printStackTrace();
        // }

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            String st = "Files in Java might be tricky, but it is fun enough!!!!!";
            // for(String w:st.split(" ")){
            for (char w : st.toCharArray()) {
                myWriter.write(w + "\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        File myFile = new File("filename.txt");
        if (myFile.exists()) {
            System.out.printf("File Name : %s \n", myFile.getName());
            System.out.printf("File Absolute Path : %s \n", myFile.getAbsolutePath());
            System.out.printf("File Path: %s  \n", myFile.getPath());
            System.out.printf("File size in bytes : %s \n", myFile.length());
            System.out.printf("Can Write : %s \n", myFile.canRead());
            System.out.printf("Can Read : %s \n", myFile.canWrite());
        }
        if (myFile.delete()) {
            System.out.printf("File Name : %s has been deleted", myFile.getName());
        }
        // To create a directory
        try {
            File myfolder = new File("files");
            if (myfolder.createNewFile()) {
                System.out.printf("The folder name : %s has been created.", myfolder.getAbsolutePath());
            }
            if (myfolder.delete()) {
                System.out.printf("The folder name : %s has been deleted.", myfolder.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("An error occured in creating a folder");
        }

        System.out.println("----------------------");
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            Scanner myScanner = new Scanner(System.in);
            for (int i=1;i<=5;i++){
                String ln = myScanner.nextLine();
                myWriter.write(ln + "\n");
                if (i==5){
                    System.out.println("Do you have anything to say? (Type yes or no)");
                    String ans = myScanner.nextLine();
                    if (ans.toLowerCase().equals("yes")){
                        i=0;
                    }
                }
            }
            myScanner.close();
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occured");
        }

        try {
            System.out.println("-----------------");
            Scanner myScanner1 = new Scanner(new File("filename.txt"));
            System.out.println("Here is the file content you have saved");
            while(myScanner1.hasNext()){
                System.out.println(myScanner1.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
    }
}
