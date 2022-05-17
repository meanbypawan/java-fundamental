class TestMain{
   public static void main(String args[]){
      String s1 = new String("Cheeku");
      String s2 = new String("Cheeku");
      
      StringBuffer sb1 = new StringBuffer("Mango");
      StringBuffer sb2 = new StringBuffer("Mango");
      
      System.out.println(s1.equals(s2)); // ---> true 
      System.out.println(sb1.equals(sb2));// ---> false
   }
}
