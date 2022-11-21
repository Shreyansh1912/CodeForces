import java.util.Scanner;
public class test69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            int ans =0;

            for(int i=0; i<n; i++){
                ans = Math.max(ans, (int)s.charAt(i)-'a');
            }
           System.out.println(ans+1);
           
        }
    }
}
