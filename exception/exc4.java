import java.util.Scanner;
import java.util.InputMismatchException;
class TestMain{
   public static void main(String args[]){
      String s = "Hello";
      String s1=null;
      s1.length();
      try{
        System.out.println(s.charAt(5));
      }
      
      catch(Exception e){
         System.out.println("String is too short...");
      }
      catch(StringIndexOutOfBoundsException e){
         System.out.println("String is too short...");
      }
      System.out.println("At the end..");
   }
}
