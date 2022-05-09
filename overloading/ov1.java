class Test{
   public void m1(){
     System.out.println("Default version...");
   }
   /*
   public void m1(int x){
     System.out.println("Integer version..");
   }
   
   public void m1(float x){
     System.out.println("Float varsion..");
   }
   */
   
}
class TestMain{
  public static void main(String args[]){
    Test obj = new Test();
    obj.m1(); // DV
    obj.m1(20); //  IV
    obj.m1(2.5f);
  }
}

