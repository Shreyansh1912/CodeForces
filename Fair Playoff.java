import java.util.Arrays;
import java.util.Scanner;

public class Fair Playoff{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int[] arr = new int[4];
    
           for(int i=0; i<4; i++){
            arr[i] = sc.nextInt();
           }
           int a = Math.max(arr[0], arr[1]);
           int b = Math.max(arr[2], arr[3]);
           Arrays.sort(arr);

           System.out.println((a == arr[2] || a == arr[3]) && (b == arr[2] || b == arr[3]) ? "YES":"NO");
            
        }
    }
}
