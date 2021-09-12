public class Test07{
  public static void main(String [] args){
    Student s1 = new Student();
    System.out.println(s1.getName());
    
    Student s2 = new Student("Matin");
    System.out.println(s2.getName());
    
    Student s3 = new Student("Saad");
    System.out.println(s3.getName());
  }
}
class Student{
  private String name;
  public Student(){  
    this.name = "default name";
  }
  public String getName(){
    return this.name;
  }
  public Student(String _name){
    this.name = _name;    
  }
}

