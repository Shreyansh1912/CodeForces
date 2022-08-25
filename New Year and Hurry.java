import java.net.NetPermission;
import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c=0;
        int sum=0;
        int req = 240 - k;

        for(int i=1; i<=n; i++){
           sum += i*5;
           if(sum > req){
              break;
           }
           c++;
        }
       
        System.out.println(c);
    }
}
