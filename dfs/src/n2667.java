import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Scanner;
        import java.util.Stack;

public class n2667 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 정점의 개수

        int [][] apartment = new int[a][a];
        boolean[][] visited = new boolean[a][a];
        for(int i =0; i<a; i++){
            String line = sc.next();
            for(int j =0; j<a; j++){
                apartment[i][j] = line.charAt(j) -  '0';
            }

        }
        int danji = 0;
        ArrayList<Integer> danjis = new ArrayList<>();
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        for(int i =0; i<a; i++){
            for(int j =0; j<a; j++){
                if(apartment[i][j] == 1&& !visited[i][j]){
                    danji++;
                    Stack<int[]> stack = new Stack<>();
                    stack.push(new int[]{i,j});
                    visited[i][j] = true;
                    int count = 1;


                    while(!stack.isEmpty()){
                        int[] current = stack.pop();
                        int curX = current[0];
                        int curY = current[1];

                        for(int z = 0; z<4; z++){
                            int newX = curX + dx[z];
                            int newY = curY + dy[z];
                            if (newX >= 0 && newX < a && newY >= 0 && newY < a){
                                if (apartment[newX][newY] == 1 && !visited[newX][newY]) {
                                    stack.push(new int[] { newX, newY });
                                    visited[newX][newY] = true;
                                    count++;
                                }
                            }
                        }
                    }
                    danjis.add(count);
                }
            }

        }
        Collections.sort(danjis);
        System.out.println(danji);

        for(int count : danjis){
            System.out.println(count);
        }
        sc.close();
    }
}
