import java.util.Scanner;

public class test39{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i=0;
        while(i != s.length()){
           if(s.charAt(i) == '.'){
              System.out.print("0");
              i++;
           }
           else if(s.charAt(i) == '-' && s.charAt(i+1) == '.'){
              System.out.print("1");
              i+=2;
           } 
           else if(s.charAt(i) == '-' && s.charAt(i+1) == '-'){
            System.out.print("2");
            i+=2;
           }
        }
        
    }
}
