import java.util.*;
public class test1 {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       int c=0, co=0;
       for(int i=0; i<s.length(); i++){
          char ch = s.charAt(i);
          
          if(Character.isUpperCase(ch))
             c++;
          else if(Character.isLowerCase(ch))
            co++; 
        }
        if(c <= co)
         System.out.println(s.toLowerCase());
        else
         System.out.println(s.toUpperCase());
    }
}
