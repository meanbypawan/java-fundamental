
class A{
  static{
        System.out.println("Block-A");
     }
}

class TestMain{
    static{
      System.out.println("Block-Main");
    }   
     public static void main(String args[]){
       System.out.println("Main called...");
       A obj = new A();
       A obj2 = new A();
       System.out.println("Main End..");
     }
}

