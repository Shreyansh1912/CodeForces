import java.util.Scanner;

public class test56{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            char[] ch = s.toCharArray();
            
            int s1=0;
            for(int i=0; i<ch.length/2; i++){
                s1+=ch[i];
            }
            int s2=0;
            for(int i=ch.length/2; i<ch.length; i++){
                  s2 += ch[i];
            }
            
            System.out.println(s1 == s2 ? "YES":"NO");
        }
    }
}
