import java.util.*;
public class test72 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int i,j,n,d;
        while(t-->0){
            n=sc.nextInt();
            int [] a1= new int[n];
            int [] a2= new int[n];
            for(i=0;i<n;i++){
                a1[i]=sc.nextInt();
                a2[i]=a1[i];
            }
            Arrays.sort(a2);

            d=a2[n-1];
            j=a2[n-2];

            for(i=0;i<n;i++){
                if(a1[i]==d) System.out.print(d-j+" ");
                else System.out.print(a1[i]-d+" ");
            }
            System.out.println();
        }

    }
}
