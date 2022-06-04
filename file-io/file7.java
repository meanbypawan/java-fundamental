import java.io.*;
import java.util.Scanner;
class TestMain{
  public static void main(String args[]){
     FileWriter fw = null;
     try{
        Scanner sc = new Scanner(System.in);
        fw = new FileWriter("xyz.txt");
        System.out.println("Enter Data....");
        String data = sc.nextLine();
        fw.write(data);
        System.out.println("Operation Success....");
     }
     catch(Exception e){
       e.printStackTrace();
     }
     finally{
      try{
       fw.close();
      }
      catch(Exception e){
        e.printStackTrace();
      } 
     }
  }
}
