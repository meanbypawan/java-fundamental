interface Shape{
   void getArea();
}
class Circle implements Shape{
   public void getArea(){
      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.println("Enter Radius");
      int r = sc.nextInt();
      System.out.println("Circle Area : "+(3.14*r*r));
   }
}
class Rectangle implements Shape{
   public void getArea(){
      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.println("Enter L and W");
      int l = sc.nextInt();
      int w = sc.nextInt();
      System.out.println("Rectange Area : "+(l*w));
   }
}
class TestMain{
   public static void main(String args[]){
      java.util.Scanner sc = new java.util.Scanner(System.in);
      Shape s = null;
      System.out.println("Enter Choice....1 or 2");
      int choice = sc.nextInt();
 
      if(choice == 1)
        s = new Circle();
      else if(choice == 2)
             s = new Rectangle();
      
      if(s!=null)
        s.getArea();
      else
        System.out.println("Only 1 or 2 allowed...");                     
   }  
}
