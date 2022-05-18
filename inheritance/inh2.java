class Area{
   private int l,w;
   public void setData(int l, int w){
     this.l = l;
     this.w = w;
   }
   public int getArea(){
     return l*w;
   }
   public int getL(){
     return l;
   }
   public int getW(){
     return w;
   }
}
// Volume IS-A Area
class Volume extends Area{
  
  protected int h;
  public void setData(int l, int w, int h){
    super.setData(l,w);
    this.h = h;
  }
  public int getVolume(){
    return getArea() * h;
  }
  
}
class TestMain{
  public static void main(String args[]){
    Volume v = new Volume(); // v--> l,w,h
    v.setData(2,3,4);
    System.out.println("Area : "+v.getArea());
    System.out.println("Volume : "+v.getVolume());
    System.out.println("L : "+v.getL());
    System.out.println("W : "+v.getW());
  }
}
