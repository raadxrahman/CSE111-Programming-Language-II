import java.util.*;
public class Task06{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int[] arr = new int[10];
    for(int i = 0 ; i < 15 ; i++){
      int input = sc.nextInt();
      for(int j = 0 ; j < arr.length; j++){
        if(input == j){
          arr[j]+=1;
          break;
        }
      }
    }
    for(int i = 0 ; i < arr.length ; i++){
      System.out.println((i+1)+" : "+arr[i]);
    }
  }
}