import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n+1];
         for(int i=1;i<=n;i++){
			int k=sc.nextInt();
            arr[k] = i;
       }
       for(int i=1; i<=n; i++){
           System.out.print(arr[i]+ " ");
       }
       
    }   
}
