import java.util.*;
public class Task05{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int a[] = new int [10];
    int count = 0;
    for (int i = 0 ; i <a.length ; i++){
      a[i] = sc.nextInt();
    }
    int b = sc.nextInt();
    for (int i = 0 ; i<a.length ; i++){
      if (a[i]== b){
        System.out.println("Yes");
      }
      else {
        count ++ ;
      }
    }
    if (count == a.length){
    System.out.println("No");}
  }
}
