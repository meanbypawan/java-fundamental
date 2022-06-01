class TestMain{
  public static void main(String arg[]){
    try{
      throw new Throwable();
      //throw new Exception();      
      //throw new Error();
    }
    catch(Object e){
       System.out.println("Caught....");
    }
  }
}
