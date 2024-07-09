import java.util.Scanner;
import java.util.Stack;

public class n11724 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n*n
        int m = sc.nextInt();
        int[][] a = new int[n+1][n+1];
        boolean[]v = new boolean[n+1];



        for (int i = 0; i < m; i++) {
            int st = sc.nextInt();
            int ar = sc.nextInt();
            a[st][ar] = 1;
            a[ar][st] = 1;
        }

        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i = 1; i<=n;i++){
            if(!v[i]){
                st.push(i);
                ans++;
                v[i] = true;
                while(!st.isEmpty()) {
                    int po = st.pop();
                    for (int j = 1; j <= n; j++) {
                        if (!v[j] && a[po][j] == 1) {
                            st.push(j);
                            v[j] = true;
                        }
                    }
                }
            }
        }
        System.out.println(ans);


    }
}
