import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
class TestMain{
   public static void main(String args[]){
     try{ 
      File f = new File("abc.txt");
      FileOutputStream fout = new FileOutputStream(f);
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Data");
      String data = sc.nextLine();
      byte b[] = data.getBytes();
      fout.write(b);
     }
     catch(java.io.IOException e){
        e.printStackTrace();
     }
   }
}
