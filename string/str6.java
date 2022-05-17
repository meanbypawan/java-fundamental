/*
   public class java.lang.Object{
      public String toString(){
         return this.getClass().getName()+"@"+this.hashCode()
      }
      public int hashCode(){}
      public boolean equals(){}
   }
   class CustomString extends Object{
   
   }
*/
class CustomString{
  private String data;
  public CustomString(String data){
    this.data = data;
  }
  public String toString(){
     return data;
  }
}

class TestMain{
  public static void main(String args[]){
    String s = new String("Hello");
    CustomString cs = new CustomString("Hello");
    
    System.out.println("String : "+s); // hello
    System.out.println("Custom-String : "+cs);// cs.toSTring    
  }
}
