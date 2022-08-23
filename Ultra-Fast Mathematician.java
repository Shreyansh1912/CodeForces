import java.util.Scanner;

public class magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       String st = sc.nextLine();

       int[] arr = new int[s.length()];

       for(int i=0; i<s.length(); i++){
          arr[i] = s.charAt(i)^st.charAt(i);
       }
       for(int i=0; i<s.length(); i++){
        System.out.print(arr[i]);
       }
    }
}
