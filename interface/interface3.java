interface I{
   // Overriding of wish method is not mendatory in child class
   default void wish(){
     System.out.println("Good-Morning");
   }
   void m1();
}
class Test implements I{
   public void m1(){
      System.out.println("m1-implementd.....");
   }
   
}
