import java.util.Arrays;
import java.util.Scanner;

public class test34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
    
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];

            for(int j=0; j<n; j++){
                arr1[j] = sc.nextInt();
            }
            for(int j=0; j<n; j++){
                arr2[j] = sc.nextInt();
            }
           Arrays.sort(arr1);
           Arrays.sort(arr2);
            for(int j=0; j<k; j++){
                if(arr1[j] < arr2[n-j-1]){
                   int temp = arr1[j];
                   arr1[j] = arr2[n-j-1];
                   arr2[n-j-1] = temp;
               }
            }
            int sum=0;
            for(int a:arr1){
                sum += a;
            }
            System.out.println(sum);
        
        }
    }
}
