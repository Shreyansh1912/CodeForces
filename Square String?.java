import java.util.Scanner;

public class t{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();

            char ch[] = s.toCharArray();
            String s1 = "";
            String s2 = "";
                for(int i=0; i<ch.length/2; i++){
                     s1 += ch[i];
                }
                for(int i=ch.length/2; i<ch.length; i++){
                    s2 += ch[i];
                }

            if(s1.equals(s2)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }

        }
    }
}

