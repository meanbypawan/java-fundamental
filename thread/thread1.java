class First extends Thread{
   public void run(){
     try{ 
      for(int i=1; i<=5; i++){
         System.out.println("Cheeku");
         Thread.sleep(2000);
      }
     } 
     catch(Exception e){
     
     }
   }
} 
class Second extends Thread{
   public void run(){
     try{ 
      for(int i=1; i<=5; i++){
         System.out.println("Peeku");
         Thread.sleep(1600);  
      }
     }
     catch(Exception e){
     
     }
   }
} 
class TestMain{
   public static void main(String args[]){
     First t1 = new First();
     Second t2 = new Second();
     
     t1.start(); // behind the scene it call run()
     t2.start();
     
   }
}
