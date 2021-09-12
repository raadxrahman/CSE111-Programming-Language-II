import java.util.*;
public class T4{
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Please enter word");
    String s = sc.nextLine();
    int []a = new int [26];
    for(int i=0 ; i < s.length() ; i++){
      int codeCh = (int)s.charAt(i);
      a[codeCh-65]++;
    }
    for(int i=0 ; i<26 ; i++){
      char c = (char)(i+65);
      System.out.println(c + " which is " + (i+65) + " was found "+ a[i] + " times");}
  }
}
