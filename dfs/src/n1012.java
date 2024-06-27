import java.util.Scanner;
import java.util.Stack;

public class n1012 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 횟수 반복
        for(int trya = 1; trya <= t; trya++) {
            int yl = sc.nextInt();
            int xl = sc.nextInt();
            int[][] field = new int[xl][yl];
            boolean[][] visited = new boolean[xl][yl];
            int baechu = sc.nextInt();
            for(int bae = 0 ; bae<baechu; bae++){
                int y = sc.nextInt();
                int x = sc.nextInt();
                field[x][y] = 1;
            }

            int jirang = 0;
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};
            for (int i = 0; i < xl; i++) {
                for (int j = 0; j < yl; j++) {
                    if (field[i][j] == 1 && !visited[i][j]) {
                        jirang++;
                        Stack<int[]> stack = new Stack<>();
                        stack.push(new int[]{i, j});
                        visited[i][j] = true;



                        while (!stack.isEmpty()) {
                            int[] current = stack.pop();
                            int curX = current[0];
                            int curY = current[1];

                            for (int z = 0; z < 4; z++) {
                                int newX = curX + dx[z];
                                int newY = curY + dy[z];
                                if (newX >= 0 && newX < xl && newY >= 0 && newY < yl) {
                                    if (field[newX][newY] == 1 && !visited[newX][newY]) {
                                        stack.push(new int[]{newX, newY});
                                        visited[newX][newY] = true;
                                    }
                                }
                            }
                        }

                    }
                }

            }
            System.out.println(jirang);
        }
    }
}
