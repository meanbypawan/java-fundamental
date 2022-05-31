import java.util.Scanner;
class IBE extends Exception{
   public IBE(){
     super("Aapke Pass Paisa Nahi Hai....");
   }
}
class TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int bal = 50000;
    System.out.println("Enter Amount To Be Withdraw..");
    int amount = sc.nextInt();
    
    try{
       if(amount > bal)
         throw new IBE();
       else{
         bal -= amount;
         System.out.println("Withdrawal Success...");
       }  
    }
    catch(IBE e){
      e.printStackTrace();
    }
    System.out.println("At the end...");
  }
}
