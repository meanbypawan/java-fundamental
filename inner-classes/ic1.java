class A{
   class B{
       public void m1(){
         System.out.println("B-m1() called....");
       }
   }
}
class TestMain{
   public static void main(String args[]){
       A aobj= new A();       
       A.B bobj = aobj.new B();
       bobj.m1();
   }
}
