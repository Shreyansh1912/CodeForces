import java.util.Arrays;
import java.util.Scanner;

public class Marathon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int[] arr = new int[4];

            for(int i=0; i<4; i++){
                arr[i] = sc.nextInt();
            }
            int c=0;
            for(int i=0; i<4; i++){
                if(arr[0] < arr[i]){
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
