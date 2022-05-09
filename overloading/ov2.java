class Test{
 /*
  public void m1(int x){
    System.out.println("I-versoin..");
  }   
  */
  public void m1(long x){
    System.out.println("L-version");
  }
}
class TestMain{
  public static void main(String args[]){
    Test obj = new Test();
    obj.m1(20);
  }
}

