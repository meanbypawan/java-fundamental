class TestMain{
   public static void main(String args[]){
      String s1 = "A";
      String s2 = "B";
      String s3 = s1 + s2; // "AB" ---> head
      String s4 = "AB"; //---->pool
      
      System.out.println(s3 == s4);
   }
}
