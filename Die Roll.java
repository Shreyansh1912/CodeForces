import java.util.Scanner;

public class test47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = Math.max(a,b);
       
        String[] prob = {"1/6", "1/3","1/2", "2/3", "5/6" , "1/1"};

        System.out.println(prob[6-res]);
    }
}
