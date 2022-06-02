import java.io.File;
import java.text.SimpleDateFormat; 
class TestMain{
   public static void main(String args[]){
     File f = new File("xyz.txt");
     if(f.exists())
       System.out.println("File Found...");
     else
     {
       try{
        System.out.println("File Not Found...");  
        f.createNewFile();
       }
       catch(java.io.IOException e){
       
       } 
     }
   }
}
