class A{
    static{
       System.out.println("Block-A");
    }
    {
        System.out.println("Initializer-A");
    }
    public A(){
      System.out.println("A-contr");
    }
}
class B extends A{
    static{
        System.out.println("Block-B");
    }
    {
        System.out.println("Initializer-B");
    }
    public B(){
      System.out.println("B-contr");
    }
}
class TestMain{
    public static void main(String args[]){
         new B();
    }
}
