import java.util.*;
public class test1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
         int c=0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                int n = sc.nextInt();
                 if(n == 1){
                    c = Math.abs(i-2) + Math.abs(j-2);  
                    break;
                 }
            }
        }
        System.out.println(c);  
   
    }
}
