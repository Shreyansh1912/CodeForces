import java.util.*;
public class test1 {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();

       System.out.println((x%5==0? x/5:(x/5+1)));
    }
}
