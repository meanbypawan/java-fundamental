class A{
  private static A obj=null;
  private A(){
    System.out.println("Object created.....");
  }
  public static A getInstance(){
     if(obj==null)
       obj = new A();   
     return obj;        
  }
  public void sayHello(){
    System.out.println("Hello Friends.....");
  }
}

class TestMain{
  public static void main(String args[]){
     A obj1 = A.getInstance();
     A obj2 = A.getInstance();
     
     System.out.println(obj1);
     System.out.println(obj2);
    // obj.sayHello();
  }
}
