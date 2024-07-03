import java.util.Scanner;

public class n1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] fib = new int[41][2];
        fib[0][0] = 1; fib[0][1] = 0;
        fib[1][0] = 0; fib[1][1] = 1;
        for(int j = 2; j<= 40; j++){

            fib[j][0] = fib[j-2][0] +fib[j-1][0];
            fib[j][1] = fib[j-2][1] +fib[j-1][1];

        }
        int t =sc.nextInt();
        for(int i=1;i <=t;i++){
            int n = sc.nextInt();

            System.out.println(fib[n][0]);
            System.out.println(fib[n][1]);
        }
    }
}
