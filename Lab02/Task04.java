import java.util.*;
public class Task04{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int a[] = new int [10];
    int j = 0;
    for (int i = 0 ; i <20 ; i++){
      int e = sc.nextInt();
      if (e%2==0){
        a[j] = e;
        j++ ;  
      }
      
    }
    for (int i = a.length-1 ; i>=0 ; i--){
        System.out.print(a[i]+" ");}
  }
}

