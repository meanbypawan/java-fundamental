import java.util.Scanner;
class TestMain{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 2 number");
       int a = sc.nextInt();
       int b = sc.nextInt();
       try{
         int c = a/b;
         System.out.println("Result : "+c);
        }
        catch(ArithmeticException e){
          e.printStackTrace();
        }
       System.out.println("At the end.........");
   }
}
