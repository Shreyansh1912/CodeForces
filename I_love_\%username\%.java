import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        int c=0;
       
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0], max = arr[0];
        
        for(int i=1; i<n; i++){
              if(arr[i] < min){
                  min = arr[i];
                  c++;
              }
              if(arr[i] > max){
                max = arr[i];
                c++;
              }
        }
        System.out.println(c);
    }
}
