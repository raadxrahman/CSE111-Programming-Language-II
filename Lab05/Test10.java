public class Test10{
  public static void main(String [] args){
    Student s1 = new Student("Bob", 1);
    Student s2 = new Student("Tom", 2);
    Student s3 = new Student("Jack", 3);
    Student s4 = new Student("Jill", 4);
    Printer pr = new Printer();
    pr.printDetail(s1);
    pr.printDetail(s2);
    pr.printDetail(s3);
    pr.printDetail(s4);
  }
}
class Printer{
  public void printDetail(Student s){
    System.out.println("Name of the Student: "+s.name);
    System.out.println("ID of the Student: "+s.id);
  }
}
class Student{
  public String name;
  public int id;
  public Student(String _name,int _id){
    this.name = _name ;
    this.id = _id ;
  }
}
