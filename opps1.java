class Airthmetic{
   private int a,b;
   public void setData(int x, int y){
     a = x;
     b = y;
   }
   public void add(){
     System.out.println("Addition : "+(a+b));
   }
   
}
class TestMain{
  public static void main(String args[]){
    Airthmetic obj = new Airthmetic(); // obj-->a=0,b=0
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter 2 number...");
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    obj.setData(a,b); // obj--->a=20,b=10
    
    obj.add(); // obj 
  }
}
