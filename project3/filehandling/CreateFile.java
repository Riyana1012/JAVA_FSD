package project3.filehandling;
import java.io.File;
import java.io.IOException;  
public class CreateFile {
  public static void main(String[] args) {
    try {
      File Obj = new File("new.txt");
      if (Obj.createNewFile()) {
        System.out.println("File  successfully created: " + Obj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

