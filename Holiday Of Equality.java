import java.util.Scanner;

public class test29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

            if(arr[i] > max){
                max=arr[i];
            }
        }
        int s=0;
        for(int i=0; i<n; i++){
           s += max-arr[i];
        }
       System.out.println(s);
    }
}
