import java.util.Scanner;

public class n12865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();
        int[][] a = new int[n+1][2];
        for(int i =1; i<=n;i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        int[]dp = new int[k+1];

        for(int i = 1;i<=n; i++){
            for(int j = k; j-a[i][0]>=0;j--){
                dp[j] = Math.max(dp[j], dp[j-a[i][0]]+a[i][1]);
            }
        }
        System.out.println(dp[k]);


    }

}
