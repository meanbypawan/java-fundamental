import java.io.*;
import java.util.Scanner;
class TestMain{
  public static void main(String args[]){
     try{
       File f = new File("abc.txt");
       Scanner sc = new Scanner(f);
       while(true){
         String line = sc.nextLine();
         System.out.println(line);
       }
     }
     catch(Exception e){
       System.out.println("Operation success....");
     }
  }
}
