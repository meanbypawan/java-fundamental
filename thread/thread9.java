class TestMain{
   public static void main(String args[]){
     Runnable r1 = ()->{
        try{
          for(int i=1; i<=5; i++){
            System.out.println("Hello....");
            Thread.sleep(1000); 
          }
        }
        catch(Exception e){
        
        }
     };
      Runnable r2 = ()->{
        try{
          for(int i=1; i<=5; i++){
            System.out.println("Hi....");
            Thread.sleep(1300); 
          }
        }
        catch(Exception e){
        
        }
     };
     new Thread(r1).start();
     new Thread(r2).start();
   }
}
