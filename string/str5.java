class TestMain{
   public static void main(String args[]){
      String s1 = "Java$is$Object$Oriented$Programming$lang";
      /*
         0-> Java
         1->is
      */
      //String items[] = s1.split(" ");
      //String items[] = s1.split("\\.");
      String items[] = s1.split("\\$");
      for(String data : items)
        System.out.println(data);
   }
}
