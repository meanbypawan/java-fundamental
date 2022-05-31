import java.util.Scanner;
class TestMain{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     try{
       System.out.println("Enter 2 number");
       int a  = sc.nextInt();
       int b = sc.nextInt();
       int result = a/b;
       System.out.println("Result : "+result);
     }
     finally{
       System.out.println("Finally executed...");
     }
     System.out.println("At the end......");
   }
}
