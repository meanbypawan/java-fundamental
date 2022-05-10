class Test{
  public void add(int... x){
    System.out.println("Addition of all number...");
  }

}
class TestMain{
  public static void main(String arg[]){
     Test obj = new Test();
     obj.add(20,10);
     obj.add(20,10,5);
     obj.add(20,10,5,6);
  }
}
