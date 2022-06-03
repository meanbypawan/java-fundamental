import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
class Customer implements Serializable{
  private int id;
  private String name;
  private transient String mobile;
  private int age;
  public Customer(int id, String name, String mobile,int age)  {
    this.id = id;
    this.age = age;
    this.mobile = mobile;
    this.name = name;
  }
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public String getMobile(){
    return mobile;
  }
  public Customer(){}
}
class TestMain{
   public static void main(String args[]){
     try{
       File f = new File("customer.txt");
       if(!f.exists())
         f.createNewFile();
         
       FileOutputStream fout = new FileOutputStream(f);
       ObjectOutputStream oos = new ObjectOutputStream(fout);
       
       Customer c = new Customer(1,"Cheeku","900911122",21);  
     
       oos.writeObject(c);
       System.out.println("Operation Success.....");
     }
     catch(Exception e){
       e.printStackTrace();
     }
   }
}
class ReadObject{
   public static void main(String args[]){
      try{
         FileInputStream fin = new FileInputStream("customer.txt");
         
         ObjectInputStream ois = new ObjectInputStream(fin);
         
         Customer c = (Custmer)ois.readObject(); // Object
         System.out.println(c.getId()+"  "+c.getName()+" "+c.getMobile()+"  "+c.getAge());
         
      }
      catch(Exception e){
      
      }
   }
}

