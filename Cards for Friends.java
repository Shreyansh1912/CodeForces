import java.util.Scanner;

public class Cards for Friends{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();

            int dim = w*h;
            int count=1;
             
           while(dim%2 == 0){
               dim /= 2;
              count *= 2;
           }
           System.out.println(count >= n?"YES":"NO");
        }
    }
}

