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
       System.out.println("After Create : "+t1.getState());
       
       t1.start();
       System.out.println("After Start : "+t1.getState());
       
       System.out.println("isAlive : "+t1.isAlive());
       t1.join();
       System.out.println("isAlive : "+t1.isAlive());
       System.out.println("After Comple.. : "+t1.getState());
     }
     catch(Exception e){
     
     }     
   }
}
