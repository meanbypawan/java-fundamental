class Task{
   synchronized public void m1(){
     try{
       for(int i=1; i<=5; i++){
         System.out.println(Thread.currentThread().getName()+" executing m1()");
         Thread.sleep(1000);
       }
     }
     catch(Exception e){
       e.printStackTrace();
     }
   }
   synchronized public void m2(){
     try{
       for(int i=1; i<=5; i++){
         System.out.println(Thread.currentThread().getName()+" executing m2()");
         Thread.sleep(1000);
       }
     }
     catch(Exception e){
       e.printStackTrace();
     }
   }
   synchronized static public void m3(){
     try{
       for(int i=1; i<=5; i++){
         System.out.println(Thread.currentThread().getName()+" executing m3()");
         Thread.sleep(5000);
       }
     }
     catch(Exception e){
       e.printStackTrace();
     }
   }
   synchronized static public void m4(){
     try{
       for(int i=1; i<=5; i++){
         System.out.println(Thread.currentThread().getName()+" executing m4()");
         Thread.sleep(5000);
       }
     }
     catch(Exception e){
       e.printStackTrace();
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
class Second extends Thread{
   Task task;
   public Second(Task task){
     this.task = task;
   }
   public void run(){
      task.m2();   
   }
}
class Third extends Thread{
   Task task;
   public Third(Task task){
     this.task = task;
   }
   public void run(){
      task.m3();   
   }
}
class Fourth extends Thread{
   Task task;
   public Fourth(Task task){
     this.task = task;
   }
   public void run(){
      task.m4();   
   }
}

class TestMain{
   public static void main(String args[]){
     Task task = new Task();
     First t1 = new First(task);
     Second t2 = new Second(task);
     Third t3 = new Third(task);
     Fourth t4 = new Fourth(task);
     t1.setName("Thread-T1");
     t2.setName("Thread-T2");
     t3.setName("Thread-T3");
     t4.setName("Thread-T4");
     
     t1.start();
     t2.start();
     t3.start();
     t4.start();
   }
}
/*
  T1,T2-----> IS -------> T1
  
  T3,T4----->SS  -------->T3
*/




