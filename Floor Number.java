import java.util.Scanner;

public class t{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int floor = 1;
            int room = 2;

            while(room < a){
               room += b;
               floor++;
            }
            System.out.println(floor);
        }
    }
}
