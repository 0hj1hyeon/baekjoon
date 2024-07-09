import java.util.Scanner;

public class n1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();

        int[][]abc = new int[a][a];
        for(int i =0;i<a;i++){
            for(int j =0;j<3;j++){
                abc[i][j]= sc.nextInt();
            }
        }

        for(int i = 1; i<a;i++){
            for(int j =0;j<3;j++){
                int p1 =(j+1)%3;
                int p2 =(j+2)%3;
                if(abc[i-1][p1]>=abc[i-1][p2]) {
                    abc[i][j] += abc[i - 1][p2];
                }
                else{
                    abc[i][j] += abc[i-1][p1];
                }
            }
        }
        int ans = abc[a-1][0];
        if ( abc[a-1][1] < ans) {
            ans =  abc[a-1][1];
        }
        if ( abc[a-1][2] < ans) {
            ans =  abc[a-1][2];
        }
        System.out.println(ans);

    }
}
