import java.util.Scanner;

public class test42{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        String s = sc.next();
        char[] ch = s.toCharArray();
        int sum=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
              sum += x1;
            } else if(s.charAt(i) == '2'){
                sum += x2;
            } else if(s.charAt(i) == '3'){
                sum += x3;
            } else if(s.charAt(i) == '4'){
                sum += x4;
            }
        }
        System.out.println(sum);
    }
}
