import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();

        for(int i=1; i<=9; i++){
            int val = i*k;
            int rem = val%10;

            if(rem == r || rem == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
