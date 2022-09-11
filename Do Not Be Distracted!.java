import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test37{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
          
            if(n == 1){
                System.out.println("YES");
            }
            
            else{
                 Set<Character> hs = new HashSet<>();
                 boolean flag=false;
    
                for(int i=0; i<n; i++){
                    if(i != 0){
                        if((s.charAt(i) != s.charAt(i-1)) && hs.contains(s.charAt(i))){
                         System.out.println("NO");
                         flag=true;
                         break;
                        }
                    }
                   hs.add(s.charAt(i)); 
                }
                if(flag == false){
                    System.out.println("YES");
                }
            }
           
        }
    }
}
