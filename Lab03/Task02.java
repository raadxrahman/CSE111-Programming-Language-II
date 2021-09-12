import java.util.*;
public class Task02{
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    String s;
    System.out.println("Please enter word");
    s = sc.nextLine();
    int l = s.length();
    for (int i=0 ; i < l ; ++i){
      System.out.println(s.charAt(i));
    }
  }
}