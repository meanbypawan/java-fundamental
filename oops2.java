class Arithmetic{
   private int a,b;
   public void setData(int a, int b){
     this.a = a;
     this.b = b;
   }
   public void setA(int a){
     this.a = a;
   }
   
   public void setB(int b){
     this.b = b;
   }
   
   public int getA(){
     return a;
   }
   
   public int getB(){
     return b;
   }
   
   public void add(){
     System.out.println("Addition : "+(a+b));
   }
   public void display(){
     System.out.println("a-state : "+a+" b-state : "+b);
   }
}
class TestMain{
  public static void main(String arg[]){
    Arithmetic obj = new Arithmetic(); // obj-->a=0,b=0
    obj.display(); // 
    obj.setA(20);
    obj.display(); // a:20, b=0
    obj.setB(10);
    obj.display();
    obj.add();
  }
}





