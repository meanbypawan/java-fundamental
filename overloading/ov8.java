class Test{
  public void add(int x, int y){
    System.out.println("Addition of 2 number...");
  }
  public void add(int x, int y, int z){
    System.out.println("Addition of 3 number...");
  }
  public void add(int x, int y, int z, int p){
    System.out.println("Addition of 4 number...");
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
