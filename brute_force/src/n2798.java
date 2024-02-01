import java.util.Scanner;

public class n2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int r = 0;

        for (int i = 0; i < n - 2; i++) {

            for (int j = i + 1; j < n - 1; j++) {


                for (int k = j + 1; k < n; k++) {


                    int t = a[i] + a[j] + a[k];


                    if(r < t && t <= m) {
                        r= t;
                    }
                }
            }
        }
        System.out.println(r);

    }
}
