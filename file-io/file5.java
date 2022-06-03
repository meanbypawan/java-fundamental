import java.io.File;
import java.io.FileInputStream;
class TestMain{
   public static void main(String args[]){
     try{ 
      File f = new File("abc.txt");
      FileInputStream fin = new FileInputStream(f);
      String data = "";
      while(true){
         int x = fin.read();
         if(x==-1)
           break;
         data  =  data +(char)x;    
      }
      System.out.println(data);
      
     }
     catch(java.io.IOException e){
        e.printStackTrace();
     }
   }
}
