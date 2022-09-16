import java.util.Scanner;

public class Favorite_Sequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int i;
            int[] arr = new int[n];

            for(i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int k=0;
            for(i=0; i<n; i++){
               if(i%2==0){
                  System.out.print(arr[k]+" ");
                  continue;
               }
               else{
                System.out.print(arr[n-1-k]+" ");
                k++;
               }
            }
            System.out.println();
        }
    }
}
