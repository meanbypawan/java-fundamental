interface I{
  void operation(int x, int y);
}
class TestMain{
   public static void main(String args[]){
      I obj = (a,b)->System.out.println("Addition : "+(a+b));
   
      I obj2 = (a,b)->{
         if(a>b)
           System.out.println(a+" > "+b);
         else
           System.out.println(a+" < "+b);
      };
      obj.operation(20,10);
      obj2.operation(20,10);
   }
}
