import java.util.Scanner;

public class t{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int odd=1;

            if(a == b){
                System.out.println("0");
            } else if(a > b){
                System.out.println((b-a)%2 == 0 ? "1":"2");
           }
           else{
            System.out.println((b-a)%2 == 0? "2":"1");
           }
        }
    }
}
