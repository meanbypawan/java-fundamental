class First extends Thread{
   public void run(){
     try{
       for(int i=1; i<=5; i++){
         System.out.println("Hello.....First");
         Thread.sleep(2000);
       }
     }
     catch(Exception e){
       e.printStackTrace();
     }
   }
}
class TestMain{
   public static void main(String args[]){
     try{
       First t1 = new First();
       t1.start();
       //t1.run();
       for(int i=1; i<=5; i++){
         System.out.println("Hello.....main");
         Thread.sleep(1500);
       } 
     }
     catch(Exception e){
       e.printStackTrace();    
     }     
   }
}
