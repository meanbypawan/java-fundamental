import java.io.File;
import java.text.SimpleDateFormat; 
class TestMain{
   public static void main(String args[]){
     File f = new File("abc.txt");
     System.out.println("Name : "+f.getName());
     System.out.println("Path : "+f.getAbsolutePath());
     System.out.println("Size : "+f.length());
     System.out.println("canRead : "+f.canRead());
     System.out.println("canWrite : "+f.canWrite());
     System.out.println("canExe : "+f.canExecute());
     System.out.println("isHidden : "+f.isHidden());
     long time = f.lastModified();
     SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm");
     String date = sd.format(time);
     System.out.println(date);
      //System.out.println("Last Modified : "+f.lastModified());
   }
}
