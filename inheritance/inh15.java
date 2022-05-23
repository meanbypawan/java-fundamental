abstract class A{
    public void m1(){
      System.out.println("m1-called in A");
    }
    abstract public void wish();
}
class B extends A{
    public void wish(){
       System.out.println("Good- Morning..");
    }  
}
class TestMain{
    public static void main(String args[]){
       A obj = new B();
       obj.m1();
       obj.wish();
    }
}
