class TestMain{
   public static void main(String args[]){
       String s1 = "hello";
       String s2 = new String("hello");
       String s3 = s2.intern();  
       
       System.out.println(s2 == s3);
   }
}

20 20.5f "helloo"
