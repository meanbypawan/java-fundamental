class Task{
  public void m1(){
   try{ 
    synchronized(this){
      for(int i=1; i<=5; i++){
         Thread currentThread = Thread.currentThread();
         System.out.println(currentThread.getName()+" in sync block");
         Thread.sleep(500);
      }
    }
    for(int i=1; i<=5; i++){
         System.out.println(Thread.currentThread().getName()+" outsied the block");
         Thread.sleep(5000);
    }
   }
   catch(Exception e){
     System.out.println(e);
   } 
  }
}
class First extends Thread{
   Task task;
   public First(Task task){
      this.task = task;
   }
   public void run(){
      task.m1();
   }
}
class TestMain{
   public static void main(String args[]){
     Task task = new Task();
     First t1 = new First(task);
     First t2 = new First(task);
   
     t1.setName("Thread-T1");
     t2.setName("Thread-T2");
   
     t1.start();
     t2.start();
   }
}
