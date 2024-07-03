import java.util.Scanner;
import java.util.Stack;

public class n10026 {
    static int checkcolor(char c, boolean[][] v, char[][] a, int n){
        int count = 0;
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        for(int i =0; i<n ;i++){
            for(int j =0; j<n;j++){
                if(a[i][j] == c && !v[i][j]){
                    count++;
                    Stack<int[]> st = new Stack<>();
                    st.push(new int[]{i,j});
                    v[i][j] = true;
                    while(!st.empty()){
                        int[] cur = st.pop();
                        int cx = cur[0];
                        int cy = cur[1];
                        for(int k = 0; k<4; k++){
                            int newx = dx[k]+cx;
                            int newy = dy[k]+cy;
                            if(newx >= 0 && newx < n && newy >= 0 && newy < n){
                                if(a[newx][newy] == c && !v[newx][newy]){
                                    st.push(new int[]{newx,newy});
                                    v[newx][newy] = true;
                                }
                            }
                        }
                    }
                }

            }
        }

        return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n*n
        char[][] a = new char[n][n];
        boolean[][] v = new boolean[n][n];



        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < n; j++) {
                a[i][j] = line.charAt(j);

            }
        }
        int answer1=0;
        int answer2=0;
        answer1 += checkcolor('R',v,a,n);
        answer1 += checkcolor('G',v,a,n);
        answer1 += checkcolor('B',v,a,n);
        System.out.println(answer1);

        boolean[][] v1 = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j] == 'G'){
                    a[i][j] = 'R';
                }
            }
        }

        answer2 += checkcolor('R',v1,a,n);
        answer2 += checkcolor('B',v1,a,n);
        System.out.println(answer2);

    }
}
