import java.util.Scanner;

public class Fafa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int c=0;
       for(int i=1; i<=t/2; i++){
           if(t%i == 0) c++;
       }
       System.out.println(c);
    }
}

