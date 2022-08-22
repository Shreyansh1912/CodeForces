import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String rev = new StringBuilder(sc.next()).reverse().toString();
        
        System.out.println(t.equals(rev) ? "YES":"NO");
        
    }
}
