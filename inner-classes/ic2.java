class A{
   static class B{
       public void m1(){
         System.out.println("B-m1() called....");
       }
   }
}
class TestMain{
   public static void main(String args[]){
     A.B obj =  new A.B();
     obj.m1();
   }
}
