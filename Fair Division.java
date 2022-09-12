import java.util.Scanner;

public class test44{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0)
        {
           int n = sc.nextInt();
           int[] arr = new int[n];

           for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
           }
           int c=0, co=0;
           for(int i=0; i<n; i++){
                   if(arr[i] == 1){
                      c++;
                   } else if(arr[i] == 2){
                      co++;
                   }
            }
           if((c%2 == 0 && co%2 == 0) || (c%2 == 0 && co%2 == 1 && c != 0)) {
            System.out.println("YES");
           } else{
            System.out.println("NO");
           }
        }
    }
}
