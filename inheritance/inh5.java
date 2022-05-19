class A{
    static{
         System.out.println("Block-A");
    }
    
    {
       System.out.println("Initializer Block-1");
    }
    {
       System.out.println("Initializer Block-2");
    }
    public A(){
        System.out.println("A-default");
    }
}
class TestMain{
    public static void main(String args[]){
        new A();
    }
}
