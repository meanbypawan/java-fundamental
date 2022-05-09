import java.util.Scanner;
// 2-d is collection 1-d array
class TestMain{
  public static void main(String args[]){
    int x[][] = new int[3][3];
    /*
       x[0]---> 10 20 30
       x[1]---> 40 50 60 80
       x[2]---> 70 80 90 
    */
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter (3x3) Matrix..");  
    for(int r=0; r<x.length; r++){
      System.out.println("Enter "+x[r].length+" element in "+(r+1)+" row");
      for(int c=0; c<x[r].length; c++){
        x[r][c] = sc.nextInt();
      }
    }
    System.out.println("Give Matrix...");
    for(int r=0; r<x.length; r++){
      for(int c=0; c<x[r].length; c++){
        System.out.print(" "+x[r][c]);
      }
      System.out.println();
    }     
  }
}






