import java.util.ArrayList;
import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       
        while(t-->0){
            int n = sc.nextInt();
            int a = n;
            int c=0,pow=0;
            ArrayList<Integer> al = new ArrayList<>();
            while(a > 0){
                int rem = a%10;
                if(rem != 0){
                    int b = rem * (int)Math.pow(10,pow);
                    al.add(b);
                    c++;
                }
                a=a/10;
                pow++;
            }
            System.out.println(c);
            for(int i=0; i<al.size(); i++){
                System.out.print(al.get(i)+" ");
            }
            System.out.println();
            }
        }
    }
