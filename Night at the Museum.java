import java.util.Scanner;

public class test66{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String s = sc.next();
       int moves=0;
       int pointer = 'a';

       for(int i=0; i<s.length(); i++){
             int c = Math.abs(s.charAt(i) - pointer);
             int diff = 26 - c;

             moves += Math.min(c, diff);
             pointer = s.charAt(i);
       }
       System.out.println(moves);
    }
}


