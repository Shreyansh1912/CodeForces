import java.util.Scanner;

public class test46 {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0){
        int n = sc.nextInt();

        int two = n/3;
        int one = two;

        int rem = n%3;

        if(rem == 1){
            one++;
        } else if(rem == 2){
            two++;
        }
       System.out.println(one+" "+two);

      }
   }
}
