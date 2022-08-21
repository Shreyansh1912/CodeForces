import java.util.*;
public class test1 {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       long n = sc.nextLong();
       int c=0;
       while(n>0){
          if(n%10 == 4 || n%10 == 7){
             c++;
          }
          n=n/10;
        }
       System.out.println((c == 4 || c == 7) ? "YES":"NO");
    }
}
