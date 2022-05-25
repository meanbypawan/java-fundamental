interface I{
   abstract void m1();
   void m2();
}
class Test implements I{
   public void m2(){
      System.out.println("m2-called.....");
   }
   public void m1(){
      System.out.println("m1-called.....");
   }
   public void m3(){
      System.out.println("m2-called....");
   }
}
class TestMain{
  public static void main(String args[]){
     /*
       I obj = new Test();
       obj.m1();
       obj.m2();
       obj.m3();
     */
     Test obj = new Test();
     obj.m1();
     obj.m2();
     obj.m3();
  }
}

