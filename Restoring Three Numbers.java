import java.util.Scanner;

public class test18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        for(int i=0; i<4; i++){
            arr[i] = sc.nextInt();
        }

        int max=0;
        for(int i=0; i<4; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i=0; i<4; i++){
            if(max - arr[i] != 0){
                System.out.print(max-arr[i]+" ");
            }
        }
    }
}
