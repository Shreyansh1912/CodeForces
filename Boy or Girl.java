import java.util.*;
public class test1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
       
        HashSet<Character> hs = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            hs.add(s.charAt(i));
        }
        if(hs.size() % 2 == 0)
          System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");  
    }
}
