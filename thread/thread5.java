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
    /*
      join()
      join(long); // milisecond
      join(long,long); // milisecond,nenosecond
    */
   try{ 
     t1.start();
     t1.join(1500,500); // At this point it will stop main
     t2.start();
     t3.start();
    }
    catch(Exception e){
      e.printStackTrace();
    }        
  }
}

