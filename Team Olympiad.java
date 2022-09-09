import java.util.ArrayList;
import java.util.Scanner;

public class test28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int p = 0, q = 0, r = 0;
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        ArrayList<Integer> al3 = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                p++;
                al1.add(i + 1);
            } else if (arr[i] == 2) {
                q++;
                al2.add(i + 1);
            } else {
                r++;
                al3.add(i + 1);
            }
        }
        int z = Math.min(p, Math.min(q, r));
        System.out.println(z);

        for (int i = 0; i < z; i++) {
            System.out.println(al1.get(i) + " " + al2.get(i) + " " + al3.get(i) + " ");
        }
    }
}
