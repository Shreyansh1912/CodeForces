import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        int c=0;
        while(n-->0){
            Long a = sc.nextLong();
            Long b = sc.nextLong();
           
        System.out.println(a%b==0?"0":b-(a%b));

        }
    }
}
