class Test{
    public Test(){
        System.out.println("Default.....");
    }
    public Test(int x){
       System.out.println("Integer version");
    }
    public Test(int x, int y){
       System.out.println("Integer Integer version");
    }
}
class TestMain{
    public static void main(String arg[]){
        Test obj = new Test();  
    }
}