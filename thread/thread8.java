class First implements Runnable{
   public void run(){
     try{
        for(int i=1; i<=5; i++){
         System.out.println("Hello..Runnable");
         Thread.sleep(1000);
        }
     }
     catch(Exception e){
     
     }
   }
}
class TestMain{
   public static void main(String args[]){
     First f = new First();
     new Thread(f).start();
   }
}
