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
class TestMain{
  public static void main(String ar[]){
    System.out.println(Thread.currentThread().getName());
    Thread.currentThread().setPriority(7);
    First t1 = new First();
    System.out.println(t1.getPriority());
  }
}

