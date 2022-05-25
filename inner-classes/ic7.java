class Outer{
   public Outer(){
     System.out.println("Outer called....");
   }

   class Inner{
      public Inner(){
        System.out.println("Inner Constuctor....");
      }
      public void m1(){
        System.out.println("Inner m1 called...");
      }
   }
   public void m2(){
      System.out.println("Outer m1 called...");
   }
}
class Child extends Outer.Inner{
     public Child(){
       new Outer().super();
     }
}
class TestMain{
   public static void main(String args[]){
      Child obj = new Child();
   }
}
