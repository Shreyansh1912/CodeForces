import java.util.*;
public class test1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ch = sc.next();
        int c=0;
        
        for(int i=0; i<ch.length()-1; i++){
            if(ch.charAt(i) == ch.charAt(i+1))
              c++;
        }
       System.out.println(c);
    }
}
