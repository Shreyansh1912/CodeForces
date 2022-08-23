import java.util.*;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        while(n-->0){
            int p = sc.nextInt();
            int q = sc.nextInt();

            if(p < q && (q-p) >=2) 
              c++;
            else
              continue;  
            
        }
       
         System.out.println(c);
    }
}
