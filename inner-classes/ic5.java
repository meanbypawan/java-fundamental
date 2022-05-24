class Outer{
   private class Inner{
      public void m1(){
        System.out.println("Inner m1 called...");
      }
   }
   public void m2(){
      System.out.println("Outer m1 called...");
   }
}
class Child extends Outer{

}
class TestMain{
   public static void main(String args[]){
      new Child().new Inner().m1();
   }
}
