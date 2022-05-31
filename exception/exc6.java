class Test{
   public int m1(){
     try{
        /*----*/
        System.out.println("Inside Tye...");
        System.exit(0);
     }
     catch(Exception e){
       System.out.println("Catch Executed....");
     }
     finally{
       System.out.println("Finally Executed....");
     }
     return 400;
   }
}
class TestMain{
   public static void main(String args[]){
      Test obj = new Test();
      int x = obj.m1();
      System.out.println("x : "+x);
   }
}
