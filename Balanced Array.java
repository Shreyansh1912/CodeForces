import java.util.Scanner;

public class test26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            int s1=0, s2=0, even=2, odd =1;

            if((n/2)%2 != 0){
                System.out.println("NO");
            } else{
                System.out.println("YES");
                for(int i=0; i<n/2; i++){
                    System.out.print(even+" ");
                    s1+=even;
                    even+=2;
                }
                for(int i=n/2; i<n; i++){
                   if(i == n-1) System.out.println(Math.abs(s1-s2));
                   else System.out.print(odd+" ");
                    s2+=odd;
                    odd+=2;
                }
            }
        }
    }
}
