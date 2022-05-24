abstract class Area{
  protected int l,w;
  public Area(int l, int w){
     this.l = l;
     this.w = w;
  }    
  abstract public int getArea();
}
class AreaImpl extends Area{
   public AreaImpl(int l, int w){
     super(l,w);
   }
   public int getArea(){
      return l*w;
   }  
}

class TestMain{
   public static void main(String args[]){
       Area obj = new AreaImpl(2,3);
       System.out.println(obj.getArea());
   }
}
