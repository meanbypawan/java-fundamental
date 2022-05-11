class Test{
  public Test(int x){
      System.out.println("Integer Version..");
  }
  public Test(){
      System.out.println("Default version...");
  }
  public Test(int x, int y){
      System.out.println("Integer-Integer Version..");
  }
  public Test(String s){
      System.out.println("String version");
  }
}
class TestMain{
    public static void main(String args[]){
      new Test();
      new Test(20);
      new Test(20,10);
      new Test("Hello");
    }
}