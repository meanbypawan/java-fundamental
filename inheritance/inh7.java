class A{
   public void m1(){
      System.out.println("A-m1()");
   }
}
class B extends A{
    public void m1(){
       System.out.println("B-m1()");
    }
    public void m2(){
       System.out.println("B-m2()");
    }
}
class TestMain{
   public static void main(String args[]){
      B obj = new B();
      obj.m1();
      obj.m2();
   }
}

