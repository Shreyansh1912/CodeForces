import java.util.*;
public class test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String s = "";
        s=s1+s2;
        char[] c = s.toCharArray();
        char[] ch = s3.toCharArray();
        Arrays.sort(c);
        Arrays.sort(ch);
        String S1 = new String(c);
        String S2 = new String(ch);
       
        System.out.println(S1.equals(S2)?"YES":"NO");

        
    }
}
