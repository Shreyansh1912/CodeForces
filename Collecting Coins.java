import java.util.Scanner;

public class test55{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();

            int z = a+b+c+n;

            int res = Math.max(a,Math.max(b,c));

            if(z%3==0 && res <= (z/3)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
