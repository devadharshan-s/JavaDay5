import java.io.*;
import java.util.Scanner;

public class InvalidFormatException extends RuntimeException {
    public InvalidFormatException(String message) {
      super(message);
    }
}

class InvalidFormatExceptionMain{
    public static void processFile(String fileName) throws InvalidFormatException{
        if(!fileName.endsWith(".txt")){
            throw new InvalidFormatException("Must be a .txt file");
        } else {
            System.out.println("File Opened");
        }
    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String path = "C:\\Users\\devadhas\\IdeaProjects\\JavaDay5\\src\\test.exe";

    try{
        processFile(path);
    }catch (InvalidFormatException e){
        System.out.println(e);
    }
  }
}