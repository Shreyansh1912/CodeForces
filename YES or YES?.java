import java.util.Scanner;

public class t{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            s = s.toUpperCase();
            String s1 = "YES";

            if(s.equals(s1)) System.out.println("YES");
            else System.out.println("NO");

        }
        
    }
}
