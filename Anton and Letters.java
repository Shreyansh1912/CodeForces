import java.util.HashSet;
import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        HashSet<Character> hs = new HashSet<>();
       
        for(int i=0; i<ch.length; i++){
            if(ch[i] >= 'a' && ch[i] <= 'z')
              hs.add(ch[i]);
        }
        System.out.println(hs.size());
    }
}
