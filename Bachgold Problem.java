import java.net.SocketTimeoutException;
import java.util.Scanner;

public class test45 {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int res = n/2;
      System.out.println(res);

      for(int i=0; i<res-1; i++){
          System.out.print(2+ " ");
      }
      System.out.println(2 + ( n % 2));
   }
}
