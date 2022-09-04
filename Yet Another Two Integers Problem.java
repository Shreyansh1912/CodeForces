import java.util.Scanner;

public class test20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a < b){
                int res = b-a;
                int p = res/10;
                if(res%10 > 0){
                   p++;
                }
                System.out.println(p);
            }
            else if(a > b){
                int res = a - b;
                int p = res/10;
                if(res%10 > 0){
                    p++;
                 }
                System.out.println(p);
            }
            else{
                System.out.println("0");
            }
        }
    }
}
