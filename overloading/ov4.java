class Test{
  public void m1(byte x){
    System.out.println("Byte - version");
  }
  public void m1(short x){
    System.out.println("Short - version");
  }
  public void m1(long x){
    System.out.println("Long - version");
  }
  public void m1(int x){
    System.out.println("Integer - version");
  }
}

class TestMain{
  public static void main(String arg[]){
    Test obj = new Test();
    obj.m1(10L);
  }
}
