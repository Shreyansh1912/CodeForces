import java.util.*;
public class test{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int w = sc.nextInt();
     if(w >= 4){
        if(w % 2 == 0){
          System.out.println("YES");
        }
        else{
          System.out.println("NO");
        }
      }
       else{
        System.out.println("NO");
      }
    
  }
}
