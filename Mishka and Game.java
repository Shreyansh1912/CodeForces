import java.util.Scanner;

public class test33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mis = 0, chris=0;
        while(n-->0){
            int m = sc.nextInt();
            int c = sc.nextInt();
          
            if(m < c){
                chris++;
            }
            else if(m > c){
                mis++;
            }
        }
        if(mis == chris) System.out.println("Friendship is magic!^^");
        else if(mis > chris) System.out.println( "Mishka");
        else System.out.println("Chris");
    }
}
