import java.util.Scanner;

public class magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       for(int i=1; i<=n; i++){
        System.out.print("I" + "" + "" + (i%2==0? " love":" hate")+ " "+(i==n ? "it":"that" + " "));
        }
    }
}
