// var-args (Variable length argument)
// Array..
class Test{
   public void m1(int a, int b,int... x){
     System.out.println("a : "+a+" b : "+b);
     for(int i=0; i<x.length; i++)
       System.out.println(x[i]);
   }
}

class TestMain{
  public static void main(String args[]){
    Test obj = new Test();
    obj.m1(1,2,3,4,5,6,7,8,9);
  }
}
