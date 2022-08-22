import java.util.*;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i] > h){
                sum += 2;
            } else{
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
