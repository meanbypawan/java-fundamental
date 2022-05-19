class A{
   public A(String x){
     System.out.println("A-parameter");
   }
}
class B extends A{
   public B(){
     super("Cheeku");
     System.out.println("B-default......");
   }
   public B(int x){
     super("Mango");
     System.out.println("B-parameter");
   }
}

class TestMain{
   public static void main(String args[]){
     // new B();
     new B();
   }
}
