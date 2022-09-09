import java.util.Scanner;

public class test27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int toast = (k*l)/nl;
        int limes = c*d;
        int salt = p/np;

        int res = Math.min(toast,Math.min(limes, salt));
        System.out.println(res/n);
    }
}
