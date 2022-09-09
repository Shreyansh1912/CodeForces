import java.util.Scanner;

public class test31
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-->0){
        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();

        long s = (z-y)%x;
        System.out.println(z-s);
       }  
    }
}        
