import java.util.Scanner;

public class test25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i] < 5){
                if((5 - arr[i]) >= k){
                   count++;
                }
            }
        }
        if(count >= 3){
            System.out.println(count/3);
        } else{
            System.out.println("0");
        }
    }
}
