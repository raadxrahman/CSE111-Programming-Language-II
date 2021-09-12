import java.util.*;
public class Task03{
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Please enter word");
    String s = sc.nextLine();
    for (int i=0 ; i < s.length() ; ++i){
      char ch = s.charAt(i);
      int c = (int) ch;
      System.out.println(c);
    }
  }
}