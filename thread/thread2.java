class First extends Thread{
   public void run(){
     try{ 
      for(int i=1; i<=5; i++){
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(2000);
      }
     } 
     catch(Exception e){
     
     }
   }
} 
class TestMain{
   public static void main(String args[]){
     First t1 = new First();
     First t2 = new First();    
  
     t1.setName("Thread-T1");
     t2.setName("Thread-T2");    
     t1.start();
     t2.start(); 
   }
}
