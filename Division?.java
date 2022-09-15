import java.util.Scanner;

public class t{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();

            if(x <= 1399) System.out.println("Division 4");
            else if(x >= 1400 && x <= 1599) System.out.println("Division 3");
            else if(x >= 1600 && x <= 1899) System.out.println("Division 2");
            else System.out.println("Division 1");
        }
    }
}
    

