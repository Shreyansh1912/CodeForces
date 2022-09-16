import java.util.Scanner;

public class t{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        int[][] arr = new int[t][t];

        for(int i=0; i<t; i++){
            for(int j=0; j<t; j++){

                if(i == 0 || j == 0){
                    arr[i][j] = 1;
                } else{
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
            }
        }
        System.out.println(arr[t-1][t-1]);
    }
}

