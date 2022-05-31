interface I{
   int x = 20; // public static final
   default void message1(){
      System.out.println("Message-1  displayed...");
   }
   static void message2(){
     System.out.println("Message-2 displayed...");
   }
}
class TestMain{
   public static void main(String args[]){
     I.message2();
     I.x = 200;
     System.out.println(I.x);
   }
}
