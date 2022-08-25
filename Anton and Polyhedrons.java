import java.util.HashMap;
import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        HashMap<String, Integer> memo = new HashMap<>();
        memo.put("Tetrahedron", 4);
        memo.put("Cube", 6);
        memo.put("Octahedron", 8);
        memo.put("Dodecahedron", 12);
        memo.put("Icosahedron", 20);
    
       while(n-->0){
           sum += memo.get(sc.next());
       }
        System.out.println(sum);
    }
}
