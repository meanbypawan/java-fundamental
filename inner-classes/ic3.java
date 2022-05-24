class A{
   static class B{
       static public void m1(){
         System.out.println("B-m1() called....");
       }
   }
}
class TestMain{
   public static void main(String args[]){
     A.B.m1();
   }
}
