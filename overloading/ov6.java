// var-args (Variable length argument)
// Array..
class Test{
   public void m1(int... x){
     for(int i=0; i<x.length; i++)
       System.out.println(x[i]);
   }
}

class TestMain{
  public static void main(String args[]){
    Test obj = new Test();
    obj.m1(20,20,30,4,5,6,7,89);
    //obj.m1();
  }
}
