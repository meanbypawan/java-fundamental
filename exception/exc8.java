class IBE extends Exception{
   public IBE(){
     super("Insuficient balance exception");
   }
}
class ICICI{
   public void withdrawal() throws IBE{
      System.out.println("Withdrawal called.");  
   }
}
class TestMain{
   public static void main(String args[]){
      ICICI icici = new ICICI();
      try{
       icici.withdrawal();   
      }
      catch(Exception e){
        e.printStackTrace();
      }
   }
}


