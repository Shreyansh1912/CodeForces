import java.util.Scanner;

public class test35{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int even=0, odd=0, fine=0;
            for(int i=0; i<n; i++){
                if(i%2 == 0){
                    if(arr[i]%2 == 0)
                       fine++;
                    else
                        even++;   
                } else{
                    if(arr[i]%2 == 1)
                       fine++;
                    else   
                        odd++;
                }
            }
            if(fine == n) System.out.println("0");
            else if(even == odd) System.out.println(odd);
            else System.out.println("-1");
        }
        
    }
}
