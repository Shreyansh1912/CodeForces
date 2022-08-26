import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        int police=0;
        while(n-->0){
            int x = sc.nextInt();
            if(x>0){
                police+=x;
            } else{
                if(police < 1) c++;
                else police--;
            }
        }
        System.out.println(c);
        
    }
}
