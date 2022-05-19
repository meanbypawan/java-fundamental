// this, this()
// super, super()
class A{
    public A(int  x){
      System.out.println("I parameter");
    }
    public A(String x){
      System.out.println("S parameter");
    }
}
class B extends A{
    public B(){
       super(100);
       System.out.println("B-default....");
    }
}
class TestMain{
   public static void main(String args[]){
      new B();   
   }
}
