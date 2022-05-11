class Test{
    public void Test(){
        System.out.println("Called.....");
    }
}
class TestMain{
    public static void main(String arg[]){
        Test obj = new Test();  
        obj.Test();
    }
}