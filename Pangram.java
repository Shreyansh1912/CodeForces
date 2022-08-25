import java.util.HashSet;
import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> hs = new HashSet<>(); 
        int n = sc.nextInt();
        String s = sc.next();

        for(int i=0; i<n; i++){
             hs.add(Character.toLowerCase(s.charAt(i)));
        }
        System.out.println(hs.size()-1 == 25?"YES":"NO");
    }
}
