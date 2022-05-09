class TestMain{
  public static void main(String args[]){
     int a[][] = {
       {10,20,30},
       {40,50},
       {70,80,90,95}
     };
     
     for(int row[] : a){ // 
        for(int element : row){ // {40,50,60}
          System.out.print(" "+element);
        }
        System.out.println();
     }
     /*
     for(int row[] : a){
        for(int  element : row){
          System.out.print(" "+element);
        }
        System.out.println();
     }
     */
  }
}
