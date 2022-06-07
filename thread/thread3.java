class First extends Thread{
   public void run(){
     try{
       for(int i=1; i<=5; i++){
         System.out.println("Hello.....First");
         Thread.sleep(1000);
       }
     }
     catch(Exception e){
        System.out.println(e);
     }
   }
}
class Second extends Thread{
   public void run(){
     try{
       for(int i=1; i<=5; i++){
         System.out.println("Hello.....Second");
         Thread.sleep(500);
       }
     }
     catch(Exception e){
        System.out.println(e);
     }
   }
}
class Third extends Thread{
   public void run(){
     try{
       for(int i=1; i<=5; i++){
         System.out.println("Hello.....Third");
         Thread.sleep(700);
       }
     }
     catch(Exception e){
        System.out.println(e);
     }
   }
}
class TestMain{
  public static void main(String ar[]){
    First t1 = new First();
    Second t2 = new Second();
    Third t3 = new Third();
    // priority value 1-10
    // MIN_PRIORITY(1),MAX_PRIORITY(10),NORM_PRIORITY(5)   
    t1.setPriority(9);
    t2.setPriority(11);
    t3.setPriority(7);
    
    t1.start();
    t2.start();
    t3.start();        
  }
}

