import java.io.*;
import java.util.Scanner;
class TestMain{
  public static void main(String args[]){
     try{
       FileReader fr = new FileReader("abc.txt");
       String data = "";
       while(true){
         int x = fr.read();
         if(x==-1)
           break;
         data += (char)x; 
       }
       System.out.println(data);
     }
     catch(Exception e){
       e.printStackTrace();
     }
  }
}
