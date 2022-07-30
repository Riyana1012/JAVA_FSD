package project3.filehandling;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner; 
public class ReadFile {
  public static void main(String[] args) {
    try {
      File Obj = new File("new.txt");
      Scanner myReader = new Scanner(Obj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}