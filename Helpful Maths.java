import java.util.*;
public class test1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int n = s1.length();

        String[] arr = s1.split("\\+");

        Arrays.sort(arr);

        System.out.println(String.join("+", arr));
        
    }
}
