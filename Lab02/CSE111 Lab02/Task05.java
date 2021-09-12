import java.util.*;
public class Task05{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int[] arr = new int[10];
    for(int i = 0 ; i < arr.length ; i++){
      arr[i] = sc.nextInt();
    }
    int input = sc.nextInt();
    int count = 0;
    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i] == input){
        System.out.println("yes");
      }
      else{
        count++;
      }
    }
    if(count == arr.length){
      System.out.println("no");
    }
  }
}