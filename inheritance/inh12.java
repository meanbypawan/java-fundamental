class A{
  public static void main(int x){
     System.out.println("Integer version.....");
  }
   public static void main(String x){
      System.out.println("String version called...");
   }
   public static void main(String args[]){
      System.out.println("String array version called...");
      A.main("Hello");
      A.main(100);
   }
}
 
