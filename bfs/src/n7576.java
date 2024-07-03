import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n7576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = sc.nextInt();

        int[][]a = new int[z][n];

        for(int i =0; i<z;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        Queue<int[]> q = new LinkedList<>();
        for(int i =0; i<z;i++){
            for(int j=0;j<n;j++){

                if(a[i][j] == 1) {
                    q.add(new int[]{i,j,0});
                }
            }
        }

        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        int ans=0;
        while(!q.isEmpty()){
            int[] pollq = q.poll();
            ans = pollq[2];
            for(int dd =0; dd<4;dd++){
                int newx = pollq[0]+dx[dd];
                int newy = pollq[1]+dy[dd];
                if(newx >= 0 && newx < z && newy >= 0 && newy < n && a[newx][newy] == 0){
                    a[newx][newy] = 1;
                    q.add(new int[]{newx,newy,pollq[2]+1});
                }
            }
        }
        int zero = 0;
        for(int i =0; i<z;i++){
            for(int j=0;j<n;j++){
                if(a[i][j] == 0) zero++;
            }
        }

        if(zero>0){
            System.out.println(-1);
        }
        else{
            System.out.println(ans);
        }

    }
}
