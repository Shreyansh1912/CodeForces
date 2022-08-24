import java.util.HashSet;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hs = new HashSet<>();

        int p = sc.nextInt();
        for(int i=0; i<p; i++){
            hs.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            hs.add(sc.nextInt());
        }
        if(hs.size() == n) System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");
    }
}
