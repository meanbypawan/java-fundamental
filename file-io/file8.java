import java.io.*;
import java.util.Scanner;
class TestMain{
  public static void main(String args[]){
     
     // try with resource
     try(FileWriter fw = new FileWriter("xyz.txt")){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data....");
        String data = sc.nextLine();
        fw.write(data);
        System.out.println("Operation Success....");
     }
     catch(Exception e){
       e.printStackTrace();
     }
  }
}
