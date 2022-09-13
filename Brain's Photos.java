import java.util.Scanner;

public class Brain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char memo[][] = new  char[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                memo[i][j] = sc.next().charAt(0);
            }
        }
        int flag=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(memo[i][j] == 'C' || memo[i][j] == 'M' || memo[i][j] == 'Y'){
                    flag=1;
                    System.out.println("#Color");
                    System.exit(0);
                    break;
                }
            }
        }
         if(flag == 0){
            System.out.println("#Black&White");
        }
    }
}
