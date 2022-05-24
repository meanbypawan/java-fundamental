class Outer{
   class Inner{
      public void m1(){
        System.out.println("Inner m1 called...");
        m2(); 
      }
   }
   public void m2(){
      System.out.println("Outer m1 called...");
   }
}
class TestMain{
   public static void main(String args[]){
       Outer outer = new Outer();
       Outer.Inner inner = outer.new Inner();
       inner.m1();
   }
}
