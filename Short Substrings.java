import java.util.Scanner;

public class t{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            char[] s = str.toCharArray();
            for(int i=0; i<s.length-1; i+=2){
                System.out.print(s[i]);
            }
            System.out.println(s[s.length-1]);
        }
        
    }
}


