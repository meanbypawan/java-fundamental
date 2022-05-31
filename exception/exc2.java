import java.util.Scanner;
import java.util.InputMismatchException;
class TestMain{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       try{
        System.out.println("Enter 2 number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a/b;
        System.out.println("Result : "+c);
       }
       
       catch(ArithmeticException e){
         System.out.println("Denominator can't be zero");
       }
       catch(InputMismatchException e){
          System.out.println("Please enter integer only...");
       } 
       System.out.println("At the end.........");
   }
}
