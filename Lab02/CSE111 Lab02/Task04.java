import java.util.*;
public class Task04{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int[] arr = new int[10];
    int j = 0;
    for(int i = 0 ; i < 20 ; i++){
      int check = sc.nextInt();
      if(check%2 == 0){
        arr[j++] = check;
      }
    }
    for(int i = (arr.length - 1) ; i >= 0 ; i--){
      System.out.print(arr[i]+" ");
    }
  }
}