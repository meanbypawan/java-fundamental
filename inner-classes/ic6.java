class Outer{
   static class Inner{
      public void m1(){
        System.out.println("Inner m1 called...");
      }
   }
   public void m2(){
      System.out.println("Outer m1 called...");
   }
}
class Child extends Outer.Inner{

}
class TestMain{
   public static void main(String args[]){
      new Child().m1();
   }
}
