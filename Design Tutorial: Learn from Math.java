import java.util.Scanner;

public class test23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
   System.out.println(t%2==0 ? 4+ " " +(t-4) :9+ " " +(t-9));
    }
}
