import java.util.Arrays;
import java.util.Scanner;

public class test40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min =Math.abs(arr[0]-arr[1]);
        for(int i=0; i<n-1; i++){
           if(min > Math.abs(arr[i] - arr[i+1]))
             min = Math.abs(arr[i] - arr[i+1]);

        }
        System.out.println(min);
    }
    }
}
