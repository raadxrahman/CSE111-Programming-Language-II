public class Test11 { 
  public static void main (String[] args){ 
    Dog odie = new Dog("Red"); 
    Dog goofy = new Dog("Blue"); 
    odie.bark(); 
    goofy.bark(); 
    odie.changeColor("Brown"); 
    odie.bark(); 
  } 
}
class Dog { 
  private String color = "Black";
  public Dog(String _color){
    this.color = _color;
    
  }
  public void bark() {
    System.out.println(this.color+ " dog is barking.");
  }
  public void changeColor(String _color){
    this.color = _color;
  }
}
  
  
