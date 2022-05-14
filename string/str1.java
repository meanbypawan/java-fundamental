class TestMain{
   public static void main(String args[]){
     String s1 = new String();
     
     String s2 = new String("Friends....");
     
     byte b[] = {65,66,67,68};
     String s3 = new String(b);
     
     char ch[] = {'H','e','l','l','o'};
     String s4 = new String(ch);
     
     System.out.println("s1 : "+s1);
     System.out.println("s2 : "+s2);
     System.out.println("s3 : "+s3);
     System.out.println("s4 : "+s4);
   }
}
