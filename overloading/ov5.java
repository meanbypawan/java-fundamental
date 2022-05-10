class Test{
  /*
   public void m1(char x){
     System.out.println("char version...");
   }
  */
  public void m1(int x){
     System.out.println("integer version...");
   } 
}
class TestMain{
  public static void main(String arg[]){
     Test obj = new Test();
     obj.m1('A'); // char
  }
}
