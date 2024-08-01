import java.util.Scanner;

public class n10844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int[] fin = new int[10];
        int[]dp = new int[10];
        final int MOD = 1000000000;
        fin[0] =0;
        dp[0] =0;
        for(int i = 1; i <=9;i++){
            fin[i] =1;
            dp[i] =1;
        }

        for(int i=2;i<=a;i++){

            for(int k=0;k<=9;k++){
                if(k==0){
                    dp[k] = fin[k+1];
                }
                else if(k<9){
                    dp[k] = (fin[k-1]+fin[k+1])%MOD;
                }
                else{
                    dp[k] = fin[k-1];
                }
            }


            for(int j =0;j<=9;j++){
                fin[j]= dp[j];
            }
        }

        int answer =0;
        for(int i =0;i<=9;i++){
            answer = (answer+dp[i])%MOD;

        }



        System.out.println(answer);
    }
}
