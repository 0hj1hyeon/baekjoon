import java.util.Scanner;
import java.util.Stack;

public class n2468 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n*n
        int[][] a = new int[n][n];
        for(int i = 0; i< n; i++){
            for(int j = 0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int answer = 0;
        int maxnum = 0;
        for(int i = 0; i< n; i++){
            for(int j = 0; j<n; j++){
                if(maxnum <a[i][j]) maxnum = a[i][j];
            }
        }

        for(int k =0; k<=maxnum; k++) {
            boolean[][] v = new boolean[n][n];
            int answer1 = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] <= k) {
                        v[i][j] = true;
                    }
                }
            }

            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!v[i][j]) {
                        answer1++;
                        Stack<int[]> stack = new Stack<>();
                        stack.push(new int[]{i, j});
                        v[i][j] = true;
                        while (!stack.isEmpty()) {
                            int[] current = stack.pop();
                            int curX = current[0];
                            int curY = current[1];

                            for (int z = 0; z < 4; z++) {
                                int newX = curX + dx[z];
                                int newY = curY + dy[z];
                                if (newX >= 0 && newX < n && newY >= 0 && newY < n) {
                                    if (!v[newX][newY]) {
                                        stack.push(new int[]{newX, newY});
                                        v[newX][newY] = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(answer < answer1)
            {
                answer = answer1;
            }
        }
        System.out.println(answer);
    }
}
