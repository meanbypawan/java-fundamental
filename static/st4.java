class A{
  static{
     System.out.println("Block-A");
  }
}
class B{
  static{
     System.out.println("Block-B");
  }
}
class C{
  static{
     System.out.println("Block-C");
  }
}
class TestMain{
  static{
       System.out.println("Block-Main");
  }
  public static void main(String args[]){
     System.out.println("Main-started....");
     new A(); // static class loading
      new B();
     System.out.println("Main-end...");  
  }
}
// java TestMain
// it will load TestMain First ---> 
//BlockMain--->MainStarted-->Block-A--->Block-B--->MainEnd
