import java.util.Scanner;

public class test30 {
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
            int c=0, idx=0, a = arr[0];
            for(int i=1; i<n; i++){
                if(a == arr[i]){
                    c++;
                }
                else{
                    idx = i;
                }
            }
            System.out.println(c>0? idx+1:1);
          }
    }
}
