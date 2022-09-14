import java.util.Scanner;
import java.util.logging.Level;

public class t{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int level=0;
          while(true){
            n -= sum(level+1);

            if(n>=0) level++;
            else break;

          }
          System.out.println(level);
            
        
    }
    private static int sum(int n){
        return (n*(n+1))/2;

    }
}
