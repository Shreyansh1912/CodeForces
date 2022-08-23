import java.util.Scanner;

public class magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int c=1;
        for(int j=0; j<n-1; j++){
          if(arr[j] != arr[j+1])
           c++;
        }
        System.out.println(c);
    }
}
