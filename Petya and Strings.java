import java.util.*;
public class test1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int a = s1.compareToIgnoreCase(s2);

        if(a == 0)
            System.out.println("0");
        else if(a > 0)
            System.out.println("1");
        else
            System.out.println("-1");
    }
}
