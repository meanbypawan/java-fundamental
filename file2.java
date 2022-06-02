import java.io.File;
import java.text.SimpleDateFormat; 
class TestMain{
   public static void main(String args[]){
     File f = new File("/home/administrator/Documents/j2se");
     File fileItem[] = f.listFiles();
     for(File item : fileItem)
       System.out.println(item.getName());
   }
}
