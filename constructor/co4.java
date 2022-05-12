// POJO-->Plain Old Java Object
class Addition{
    private int a,b;
    public Addition(){
        a = b = 0;
    }
    public Addition(int a, int b){
        this.a = a;
        this.b = b;
    } 
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getA(){
        return a;
    }
    public int getB(){
      return b;        
    }
    public void add(){
        System.out.println("Addition : "+(a+b));
    }
}

class TestMain{
    public static void main(String arg[]){
        Addition obj = new Addition(20,10); // obj-->a=20,b=10
        obj.add();
    }
}